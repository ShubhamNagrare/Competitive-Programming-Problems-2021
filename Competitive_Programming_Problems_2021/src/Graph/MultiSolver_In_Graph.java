package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import Graph.Find_All_Path_In_Graph_Using_DFS.Graph;

public class MultiSolver_In_Graph {
	
	// Link : https://www.youtube.com/watch?v=PSy0yJQx050&list=PL-Jc9J83PIiHfqDcLZMcO9SsUDY4S3a-v&index=4
	
	//Smallest, Longest, Ceil, Floor, Kth Largest

	
	public void solve() {
		
		Graph g = new Graph();
		g.addEdge(0,1, 10);
		g.addEdge(1,2, 10);
		g.addEdge(2,3, 10);
		g.addEdge(3,4, 2);
		g.addEdge(0,3, 40);
		g.addEdge(4,5, 3);
		g.addEdge(4,6, 8);
		g.addEdge(5,6, 3);
		
		g.multiSolver(0,6);	
	}
	
	
	public static class Edge{
		int val;
		int nbr;
		int num;
		public Edge(int val, int nbr, int num) {
			this.val = val;
			this.nbr = nbr;
			this.num=num;
		}
	}
	
	public static class Pair implements Comparable<Pair>{
		int wt;
		String path;
		public Pair(int wt, String path) {
			this.wt = wt;
			this.path = path;
		}
		
		public int compareTo(Pair p) {
			return this.wt - p.wt;
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
			multiSolver(start, dest, visited, String.valueOf(start), 0, 40, 3);
			
			System.out.println("SmallPath : " + smallPath + " @ " + smallPathWt);
			System.out.println("Longest : " + longestPath + " @ " + longestPathWt);
			System.out.println("Criteria : " + cPath + " @ " + cPathWt);
			System.out.println("Criteria : " + fPath + " @ " + fPathWt);
			System.out.println("kth largest  : " + pq.peek().path + " @ " + pq.peek().wt);
		}
		
		
		static String smallPath = "";
		static Integer smallPathWt = Integer.MAX_VALUE;
		
		static String longestPath = "";
		static Integer longestPathWt = Integer.MIN_VALUE;
		
		static String cPath = "";
		static Integer cPathWt = Integer.MAX_VALUE;
		
		static String fPath = "";
		static Integer fPathWt = Integer.MIN_VALUE;
		
		static PriorityQueue<Pair> pq  = new PriorityQueue<>();
		
		private void multiSolver(int start,  int dest, Map<Integer,Boolean> visited, String stn, int wtn, int criteria, int k) {
			
			if(start == dest){
				
				if(wtn < smallPathWt) {
					smallPathWt = wtn;
					smallPath = stn;
				}
				
				if(wtn > longestPathWt) {
					longestPathWt = wtn;
					longestPath = stn;
				}
				
				if(wtn > criteria && wtn  < cPathWt) {					
					cPathWt = wtn;
					cPath = stn;					
				}
				
				if(wtn < criteria && wtn  > fPathWt) {					
					fPathWt = wtn;
					fPath = stn;					
				}
				
				if(pq.size() < k) {
					pq.add( new Pair(wtn, stn) );
				}else {
					if(wtn > pq.peek().wt) {
						pq.remove();
						pq.add(new Pair(wtn, stn));
					}
				}
				
				return;
			}
			
			visited.put(start, true);
			for(Edge now: map.get(start)) {
				if(!visited.get(now.nbr)) {
					multiSolver(now.nbr, dest, visited, stn + " " + now.nbr, wtn + now.num, criteria , k );
				}
			}
			visited.put(start, false);
		}
		
		
		
		
		public void addEdge(int src, int dest, int num) {
			if(!map.containsKey(src)) {
				map.put(src, new ArrayList<>());
			}
			map.get(src).add(  new Edge(src, dest, num) );
			
			if(!map.containsKey(dest)) {
				map.put(dest, new ArrayList<>());
			}
			map.get(dest).add(new Edge(src,dest,num));
		}
		
		
	}

}
