package Misclleneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Find_Connected_Component_In_A_Graph_Using_DFS {
	
public void solve() {
		
	Graph g = new Graph();
	g.addEdge(0,1);
	g.addEdge(1,2);
	g.addEdge(2,3);
	g.addEdge(0,3);
	g.addEdge(0,4);
	
	g.addEdge(5,6);
	g.addEdge(6,7);
	
	g.addEdge(8,8);
	
		
		g.connectedComponent();
		
	}


	class Graph{
		Map<Integer, List<Integer>> map;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		private void dfsUtil(int src, Map<Integer, Boolean> visited) {
		
			System.out.print(src + " ");
			visited.put(src, true);
			
			for(int curr : map.get(src)) {
				if(!visited.get(curr)) {
					dfsUtil(curr, visited);
				}
			}
			
		}
		
		
		public void connectedComponent() {
			Map<Integer, Boolean> visited = new HashMap<>();
			for(int k : map.keySet()) {
				visited.put(k, false);
			}
			
			int i=0;
			for(int j : map.keySet()) {			
				if(!visited.get(j)) {	
					
					System.out.println("Component " + i + " --- > ");
					dfsUtil(j, visited);
					i++;
					System.out.println();
				}
			}
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
