package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_All_Path_In_Graph_Using_DFS {
	
	
	
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
		
		g.printAllPath(0,6);	
	}
	
	
	class Graph{
		Map<Integer,List<Integer>> map = null;
		Map<Integer,Boolean> visited;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		public void printAllPath(int start, int dest) {
			visited = new HashMap<>();
			for(int curr : map.keySet()) {
				visited.put(curr, false);
			}
			printAllPath(start, visited, String.valueOf(start), dest);
		}
		
		
		private void printAllPath(int curr, Map<Integer,Boolean> visited, String stn, int dest) {
			
			if(curr == dest) {
				System.out.println(stn);
				return;
			}
			
			visited.put(curr, true);
			
			for(int now  : map.get(curr)) {
				if(visited.get(now) == false) {
					printAllPath(now, visited, stn + " " + now, dest);
				}
			}
			visited.put(curr, false);
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
