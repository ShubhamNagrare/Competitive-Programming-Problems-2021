package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Graph.Find_All_Path_In_Graph_Using_DFS.Graph;

public class MultiSolver_In_Graph {
	
	// Link : https://www.youtube.com/watch?v=PSy0yJQx050&list=PL-Jc9J83PIiHfqDcLZMcO9SsUDY4S3a-v&index=4
	
	//Smallest, Longest, Ceil, Floor, Kth Largest

	
	public void solve() {
		
		Graph g = new Graph();
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(0,3);
		
		g.addEdge(4,5);
		g.addEdge(4,6);
		
		g.addEdge(5,6);
		
		g.multiSolver(0,6);	
	}
	
	
	class Edge{
		int val;
		int nbr;
		int num;
		public Edge(int val, int nbr, int num) {
			this.val = val;
			this.nbr = nbr;
			this.num=num;
		}
	}
	
	public static class Graph{
		Map<Integer,List<Edge>> map = null;
		Map<Integer,Boolean> visited;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		public void multiSolver(int start, int dest) {
			visited = new HashMap<>();
			for(int curr : map.keySet()) {	
				visited.put(curr, false);
			}
			multiSolver(start, dest, visited, String.valueOf(start), 0);
		}
		
		
		static String smallPath = "";
		static Integer smallPathWt = Integer.MAX_VALUE;
		
		private void multiSolver(int start,  int dest, Map<Integer,Boolean> visited, String stn, int wtn) {
			
			if(start == dest){
				
				if(wtn < smallPathWt) {
					smallPathWt = wtn;
					smallPath = stn;
				}
				
				
				return;
			}
			
			visited.put(start, true);
			for(Edge now: map.get(start)) {
				if(!visited.get(now)) {
					multiSolver(now.nbr, dest, visited, stn + " " + now.nbr, wtn + now.num  );
				}
			}
			visited.put(start, false);
		}
		
		
		
		
		public void addEdge(int src, int dest, int num) {
			if(!map.containsKey(src)) {
				map.put(src, new ArrayList<>());
			}
			map.get(src).add(new Edge(src,dest,num));
			if(!map.containsKey(dest)) {
				map.put(dest, new ArrayList<>());
			}
			map.get(dest).add(new Edge(src,dest,num));
		}
		
		
	}

}
