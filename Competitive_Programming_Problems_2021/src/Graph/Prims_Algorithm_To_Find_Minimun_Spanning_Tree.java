package Graph;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;


public class Prims_Algorithm_To_Find_Minimun_Spanning_Tree {
	
	
	public void solve() {
		
		Graph g = new Graph();
		g.addEdge(0, 1, 10);
		g.addEdge(1, 2, 10);
		g.addEdge(2, 3, 10);
		g.addEdge(0, 3, 40);	
		g.addEdge(3, 4, 2);
		g.addEdge(4, 5, 3);
		g.addEdge(5, 6, 3);
		g.addEdge(4, 6, 8);
		
		g.prims(0);
		
		System.out.println("Done");
		
		
		List<List<String>> li = new ArrayList<>();
		
		List<String> l1 = new ArrayList<>();
		l1.add("add");
		l1.add("hack");
		
		List<String> l2 = new ArrayList<>();
		l2.add("add");
		l2.add("hackerrank");
		
		List<String> l3 = new ArrayList<>();
		l3.add("find");
		l3.add("hac");
		
		List<String> l4 = new ArrayList<>();
		l4.add("find");
		l4.add("hak");
		
		li.add(l1);
		li.add(l2);
		li.add(l3);li.add(l4);
		
		
		System.out.println(contacts(li));
				
	}
	

    
    public static class Trie{
    	
    	
    	 static class TrieNode{
    	        boolean isEnd;
    	        TrieNode children[];
    	        int count;
    	        
    	        public TrieNode(){
    	            isEnd = false;
    	            children = new TrieNode[26];
    	            count = 1;
    	        }
    	    }
    	 
        TrieNode root;
        
        public Trie(){
            root = new TrieNode();
        }
        
        public int search(String key){
            int index;
            TrieNode pCrawl = root;
           
            for (int i = 0; i < key.length(); i++)
            {
                index = key.charAt(i) - 'a';
           
                if (pCrawl.children[index] == null)
                    return -1;
           
                pCrawl = pCrawl.children[index];
            }
           
            return pCrawl.count;
        }
        
        
        public void insert(String key){
        	int level;
            int length = key.length();
            int index;
           
            TrieNode pCrawl = root;
           
            for (level = 0; level < length; level++)
            {
                index = key.charAt(level) - 'a';
                if (pCrawl.children[index] == null)
                    pCrawl.children[index] = new TrieNode();
           
                pCrawl = pCrawl.children[index];
            }
           
            // mark last node as leaf
            pCrawl.isEnd = true;
            pCrawl.count++;
        }
        
    }


    /*
     * Complete the 'contacts' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_STRING_ARRAY queries as parameter.
     */

    public static List<Integer> contacts(List<List<String>> queries) {
        List<Integer> list = new ArrayList<>();
        Trie trie = new Trie();
        
        if(queries.size() < 1){
            return list;
        }
        
        for(List<String> curr : queries){
            
            String first = curr.get(0);
            String second = curr.get(1);
            
            if(first == "add")
            {
                trie.insert(second);
            }
            else if(first == "find")
            {
                list.add(trie.search(second));
            }
        }
    
        return list;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	class Edge{
		int start;
		int end;
		int weight;
		public Edge(int start, int end, int weight) {
			this.start=start;
			this.end=end;
			this.weight=weight;
		}
	}
	
	class Pair implements Comparable<Pair>{
		int curr;
		int parent;
		int currWt;
		public Pair(int curr, int parent, int currWt) {
			this.curr=curr;
			this.parent=parent;
			this.currWt=currWt;
		}
		
		public int compareTo(Pair p){
			return this.currWt - p.currWt;
		}
		
	}
	
	class Graph{
		Map<Integer, List<Edge>> map = null;
		
		public Graph(){
			map = new HashMap<>();
		}
		
		
		public void prims(int start) {
			
			Queue<Pair> pq = new PriorityQueue<>();
			pq.add(new Pair(0, -1, 0));
			Map<Integer, Boolean> visited = new HashMap<>();
			for(int curr : map.keySet()) {
				visited.put(curr, false);
			}
			
			while(pq.size() > 0) {
				
				Pair top = pq.remove();
				
				if(visited.get(top.curr) == true) {
					continue;
				}
				
				visited.put(top.curr, true);
				if(top.parent != -1) {
					System.out.println("From " + top.curr + " to " + top.parent + " cost : " + top.currWt);
				}
				
				
				for(Edge e : map.get(top.curr)) {
					if(visited.get(e.end) == false) {
						pq.add(new Pair(e.end, top.curr, e.weight));
					}
				}
				
			}
 			
		}
		
		
		
		public void addEdge(int start, int end, int weight) {
			if(!map.containsKey(start)) {
				map.put(start, new ArrayList<>());
			}
			map.get(start).add(new Edge(start, end, weight));
			
			if(!map.containsKey(end)) {
				map.put(end, new ArrayList<>());
			}
			map.get(end).add(new Edge(end, start, weight));
		}
	}



}
