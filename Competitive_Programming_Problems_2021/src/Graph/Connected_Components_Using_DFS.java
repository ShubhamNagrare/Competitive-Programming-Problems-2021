package Graph;

import java.util.*;

import Graph.Implement_Depth_First_Search.Graph;

public class Connected_Components_Using_DFS {

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
		

		
		g.dfs();
	}
	
	
	
	class Graph<T>{
		Map<T, List<T>> map = null;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		public void addEdge(T start, T end) {
			if(!map.containsKey(start)) {
				map.put(start, new ArrayList<>());
			}
			map.get(start).add(end);
			
			if(!map.containsKey(end)) {
				map.put(end, new ArrayList<>());
			}
			map.get(end).add(start);		
		}
		
		
		public void dfsUtil(T src, Map<T, Boolean> visisted) {
			
			System.out.print(src + " ");
			visisted.put(src, true);
			
			for(T curr : map.get(src)) {
				if(!visisted.get(curr)) {
					dfsUtil(curr, visisted);
				}
			}
		}
		
		
		
		public void dfs() {
			Map<T, Boolean> visited = new HashMap<>();
			for(T currKey : map.keySet()) {
				visited.put(currKey, false);
			}
			
			int count = 0;
			for(T curr : map.keySet()) {
				
				if(!visited.get(curr)) {
					System.out.print("Component : " + count + " -----> ");
					dfsUtil(curr, visited);
					count++;
					System.out.println();
				}

			}
			
			
		}
		
		
	}
	
}
