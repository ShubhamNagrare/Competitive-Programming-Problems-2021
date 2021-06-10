package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Single_Source_Shortest_Path_In_Weight_Dijkstras_Algorithm {
	
	public void solve() {
		
		Graph g = new Graph();
		g.addEdge(0, 1, 10);
		g.addEdge(1, 2, 80);
		g.addEdge(2, 3, 10);
		g.addEdge(0, 3, 40);	
		g.addEdge(3, 4, 2);
		g.addEdge(4, 5, 3);
		g.addEdge(5, 6, 3);
		g.addEdge(4, 6, 8);
		
		g.ssspDijkstras(0);
		
		
	}
	
	
	
	
	class Edge{
		int start;
		int end;
		int weight;
		public Edge(int start, int end, int weight) {
			this.start = start;
			this.end = end;
			this.weight = weight;
		}
	}
	
	class Pair implements Comparable<Pair>{
		int vertex;
		String psf;
		int wsf;
		public Pair(int vertex, String psf, int wsf) {
			this.vertex = vertex;
			this.psf = psf;
			this.wsf = wsf;
		}
		
		public int compareTo(Pair p) {
			return this.wsf - p.wsf;
		}
	}
	
	
	class Graph{
		Map<Integer, List<Edge>> map = null;
		
		public Graph() {
			map = new HashMap<>();
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
		
		
		public void ssspDijkstras(int start) {
			
			PriorityQueue<Pair> pq = new PriorityQueue<>();
			pq.add(new Pair(start, start + "", 0));
			Map<Integer, Boolean> visited = new HashMap<>();
			for(int curr : map.keySet()) {
				visited.put(curr, false);
			}
			
			
			while(pq.size() > 0) {				
				Pair top = pq.remove();			
				if(visited.get(top.vertex) == true) {
					continue;
				}				
				System.out.println("Vertex : " + top.vertex + " has String : " + top.psf + " has weight " + top.wsf);
				
				visited.put(top.vertex, true);				
				for(Edge e : map.get(top.vertex)) {
					if(visited.get(e.end) == false) {
						pq.add(new Pair(e.end, top.psf +  e.end, top.wsf + e.weight));
					}
				}	
			}
			
			
			System.out.println(" " + "");
			
		}
		
		
	}

}
