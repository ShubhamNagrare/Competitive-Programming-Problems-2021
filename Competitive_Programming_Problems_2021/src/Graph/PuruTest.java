package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class PuruTest {

	
	public void solve() {
		
		// Set Graph
		// TODO
		Graph map = new Graph();
		
		
		List<String> queries = new ArrayList<String>();
		queries.add("Akshay is the husband of Bhavya");
		queries.add("Connor is the son of Akshay");
		queries.add("Diya is the daughter of Bhavya");
		queries.add("Diya is the wife od Erwin");
		queries.add("Faisal is the son of Diya");
		queries.add("Gautam is the brother of Faisal");
		
		Map<String,String> genderMap = new HashMap<>();;
		
		for(String current : queries) {
			String[] currSplit = current.split(" ");
			map.addEdge(currSplit[0], currSplit[5], currSplit[3], genderMap);	
		}
		
		map.printAdj();
		
		// Take input		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String query = br.readLine();
			String[] str = query.split(" ");			
			String relationQuery  = str[0];
			String nameQuery  = str[2];
			
			List<String> resultSet = map.getRelation(nameQuery, relationQuery, genderMap);
			if(resultSet.size() == 0) {
				System.out.println("UNKNOWN");
			}
			else {
				for(int i =0; i<resultSet.size(); i++) {
					if(i==0) {
						System.out.print(resultSet.get(i));
					}
					else {
						System.out.print(", " +resultSet.get(i));
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	

	}
	
	
	
	


class Graph{

	
	Map<String, List<RelationShip>> map = null;
	
	public Graph() {
		map = new HashMap<>();
	}
	
	public void addEdge(String personName, String otherPerson, String relation, Map<String,String> genderMap ) {
		
		if(! map.containsKey(personName)) {
			map.put(personName, new ArrayList<>());
		}
		
		if(! map.containsKey(otherPerson)) {
			map.put(otherPerson, new ArrayList<>());
		}
		
		String gender = getGender(relation);
		
		
		if(!genderMap.containsKey(personName)) {
			genderMap.put(personName, "");
		}
		String val = genderMap.get(genderMap);
		val = gender;
		genderMap.put(personName, gender);
		
		map.get(personName).add(new RelationShip(personName, otherPerson, relation, gender));	
		
		String viceRelation = "";
		String otherGender = "";
		if(genderMap.containsKey(otherPerson)) {
			viceRelation = getRequiredRelation(genderMap.get(otherPerson),relation, otherGender);
		}else {
			viceRelation = getRequiredRelation(gender,relation, otherGender);
		}
				
		map.get(otherPerson).add(new RelationShip(otherPerson, personName, viceRelation, gender));	
	}
	
	
	public List<String> getRelation(String name, String relation, Map<String,String> genderMap ) {
		
		
		
		List<String> retVal = new ArrayList<>();
		for(RelationShip curr : map.get(name)) {	
			boolean found = false;
			System.out.println("Here -> " + curr.firstPerson + "  " + curr.otherPerson + "  " + curr.firstPersonGender + "  " + curr.relation);
			String otherRelation = getRequiredRelation(curr.firstPersonGender,curr.relation, genderMap.get(curr.firstPerson));
			System.out.println("other" + otherRelation);
			System.out.println("relation.toLowerCase()" + relation.toLowerCase());
			relation = relation.toLowerCase();
			
			//1st degree connection
			if(relation.equals( otherRelation)) {
				retVal.add(curr.otherPerson);
				found = true;
			}
			
			//2nd degree connection
			if(!found) {
				
			}
			
			
		}
		return retVal;
	}
	
	
	 	public void dijkstra(String src, String des)
	    {
	 		
	 		Map<String, Integer> dj = new HashMap<>();
	 		
	 		for(String s : map.keySet()) {
	 			dj.put(s, Integer.MAX_VALUE);
	 		}
	 		
	 		Queue<RelationShip> set = new LinkedList<>();
	 		
	 		int g = dj.get(src);
	 		g = 0;
	 		dj.put(src, g);
	 		set.add(new RelationShip(src, des, "brother", getGender("brother")));
	 		//set.add(map.get(src));
	 		
	 		while(!set.isEmpty()) {
	 			
	 		//	p = set.
	 		}
		 

	    }
	

	
	

	
//	public void dijkstrasSSSP(String source) {
//		
//		Map<String, Integer> dj = new HashMap<>();
//		
//		for(String s : map.keySet()) {
//			
//			dj.put(s, Integer.MAX_VALUE);
//		}
//		
//		Set<RelationShip> set = new TreeSet<>();
//		
//		int val = dj.get(source);
//		val = 0;
//		dj.put(source, val);
//		
//		set.add(e)
//		
//		
//		
//	}
	
	
	public String getRequiredRelation(String gender, String relationFromFirstPerson, String otherGender) {
		
		switch (relationFromFirstPerson)
		{
		     case "husband":
		     return "wife";
		     
		     case "wife":
		     return "husband";
		     
		     case "brother":	    	 
		    if(gender == "M") {
		    	return "brother";
		    }
			 return "sister";
			 
			 
		     case "mother":
		    	 if((gender == "M" && otherGender == "W") ) {
		    		 return "son";
		    	 }
			 return "daughter";
			 
			 
		     case "father":
		    	 if((gender == "M" && otherGender == "W") || (gender == "M" && otherGender == "M")) {
		    		 return "son";
		    	 }
			 return "daughter";


			 
		     case "sister":
			 return "brother";
			 
			 
		     case "son":
		    	 if((gender == "M" && otherGender == "W") || (gender == "M" && otherGender == "M")) {
		    		 return "father";
		    	 }
		     return "mother";		// TODO
		     
		     
		    	 
		     case "daughter":
		    	 if((gender == "M" && otherGender == "W") || (gender == "M" && otherGender == "M")) {
		    		 return "son";
		    	 }
		     return "mother";		// TODO
		     
		     default:
		     return "No Match Found";
		}
		
	}
	
public String getGender(String firstNameRelation) {
		
	Map<String,String> gender = new HashMap<>();
	gender.put("husband", "M");
	gender.put("son", "M");
	gender.put("brother", "M");
	gender.put("wife", "W");
	gender.put("daughter", "W");
	gender.put("sister", "W");
		
	return gender.get(firstNameRelation);	
	}
	

	public String findSecondDegreeConnection() {
		return "";
	}
	
	
	
	
	public void printAdj() {
		
		for(String r : map.keySet()) {
			
			List<RelationShip> re = map.get(r);
			
			for(RelationShip t : re) {
				System.out.print(r + " has relation of " + t.relation + " with " + t.otherPerson);
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
	

//	public int bfs(String src, String destination) {
//		
//		Queue<String> q = new LinkedList<>();
//		Map<String,Integer> dist = new HashMap<>();
//		
//		for(String curr : map.keySet()) {		
//			dist.put(curr, Integer.MAX_VALUE);
//		}
//		
//		q.add(src);
//		int currVal = dist.get(src);
//		currVal = 0;
//		dist.put(src, currVal);
//		
//		while(q.size() != 0) {
//			
//			String c = q.poll();
//			
//			for(RelationShip curr : map.get(c) ) {
//				
//				if(dist.get(curr) == Integer.MAX_VALUE) {
//					q.add(curr);
//					int h = dist.get(curr);
//					h = dist.get(c) + 1;
//					dist.put(curr, h);
//				}	
//			}		
//		}
//		
//		return dist.get(destination);
//			
//	}
	
	
	
	
}



class RelationShip{
	String firstPerson = null;
	String otherPerson  = null;
	String relation = null;
	String firstPersonGender = null;
	
	public RelationShip(String key, String endNode, String edgeLable, String firstPersonGender) {
		this.firstPerson = key;
		this.otherPerson = endNode;
		this.relation = edgeLable;
		this.firstPersonGender = firstPersonGender;
	}
}
