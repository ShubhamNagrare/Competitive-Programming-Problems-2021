package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_If_A_path_Is_Present_In_A_Graph {
	
	
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
		
		System.out.println(g.isPathExist(0, 5));		
	}
	
	
	
	class Graph{
		Map<Integer,List<Integer>> map = null;
		Map<Integer,Boolean> visited;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		public boolean isPathExist(int start, int end) {
			visited = new HashMap<>();
			for(int curr : map.keySet()) {
				visited.put(curr, false);
			}
			return isPathExist(start, end, visited);
		}
		
		private boolean isPathExist(int start, int end, Map<Integer,Boolean> visited) {
			
			if(start == end) {
				return true;
			}
			
			visited.put(start, true);
			for(int curr : map.get(start)) {
				if(!visited.get(curr)) {
					return isPathExist(curr, end, visited);
				}
			}
			return false;
		}
		
		
		public void addEdge(int src, int dest) {
			if(!map.containsKey(src)) {
				map.put(src, new ArrayList<>());
			}
			map.get(src).add(dest);
			if(!map.containsKey(dest)) {
				map.put(dest, new ArrayList<>());
			}
			map.get(dest).add(src);
		}
		
		
		
		
	}

}
