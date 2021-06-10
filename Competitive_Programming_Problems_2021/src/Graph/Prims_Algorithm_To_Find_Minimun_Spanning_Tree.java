package Graph;

import java.util.ArrayList;
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
