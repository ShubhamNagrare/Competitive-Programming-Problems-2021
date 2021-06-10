package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class Dijkistras_Shortest_Start_To_Destination {
	
	
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
		
		g.dijkstras(0, 6);
			
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
		int vertex;
		String path;
		int weight;
		public Pair(int vertex, String path, int weight) {
			this.vertex = vertex;
			this.path = path;
			this.weight=weight;
		}
		
		public int compareTo(Pair p) {
			return this.weight - p.weight;
		}
		
	}
	
	
	class Graph{
		Map<Integer, List<Edge>> map = null;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		public void dijkstras(int start, int end) {
			
			PriorityQueue<Pair> pq = new PriorityQueue<>();
			pq.add(new Pair(start, "" + start, 0));
			
			Map<Integer, Boolean> visited = new HashMap<>();
			for(int curr : map.keySet()) {
				visited.put(curr, false);
			}
			
			
			while(pq.size() > 0) {
				
				Pair top = pq.remove();
				
				if(visited.get(top.vertex) == true) {
					continue;
				}
				
				if(top.vertex == end) {
					System.out.println("Current : " + top.vertex + " has path : " + top.path + " and weight : " + top.weight);
				}
				
				visited.put(top.vertex, true);
				for(Edge c : map.get(top.vertex)) {
					if(visited.get(c.end) == false) {
						pq.add( new Pair(c.end, top.path + c.end, top.weight + c.weight)  );
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
