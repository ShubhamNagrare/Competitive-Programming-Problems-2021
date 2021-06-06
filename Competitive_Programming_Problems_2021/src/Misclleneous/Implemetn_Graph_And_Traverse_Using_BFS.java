package Misclleneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Implemetn_Graph_And_Traverse_Using_BFS {
	
	
	public void solve() {
		
		Graph graph = new Graph();
		graph.addEdge(1, 6);
		graph.addEdge(1, 5);
		graph.addEdge(1, 9);
		graph.addEdge(5, 3);
		graph.addEdge(3, 9);
		graph.addEdge(3, 7);
		graph.addEdge(6, 7);
		
		graph.bfs(1);
		
	}
	
	
	class Graph{
		Map<Integer, List<Integer>> map;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		public void addEdge(int start, int end) {
			if(!map.containsKey(start)) {
				map.put(start, new ArrayList<Integer>());
			}
			map.get(start).add(end);
			if(!map.containsKey(end)) {
				map.put(end, new ArrayList<Integer>());
			}
			map.get(end).add(start);
		}
		
		
		public void bfs(int start) {			
			Queue<Integer> queue = new LinkedList<>();
			Map<Integer,Boolean> visited = new HashMap<>();
			
			queue.add(start);
			visited.put(start, true);
			
			while(!queue.isEmpty()) {			
				int curr = queue.poll();
				System.out.print(curr + " ");
				
				for(Integer k : map.get(curr)) {
					if(!visited.containsKey(k)) {
						queue.add(k);
						visited.put(k, true);
					}
				}		
			}		
		}
		
		
	}
	

}
