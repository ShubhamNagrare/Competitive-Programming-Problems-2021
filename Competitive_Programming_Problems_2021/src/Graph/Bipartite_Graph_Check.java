package Graph;

import java.beans.Visibility;
import java.util.*;

public class Bipartite_Graph_Check {
	
	public void isBipartite() {
		
		Graph g = new Graph();
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 5);
		g.addEdge(5, 0);
		g.dfs();
		
	}
	
	
	
	
	class Graph{
		Map<Integer, List<Integer>> map = null;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		public void addEdge(int start, int end){
			if(!map.containsKey(start)) {
				map.put(start, new ArrayList<>());
			}
			map.get(start).add(end);
			
			if(!map.containsKey(end)) {
				map.put(end, new ArrayList<>());
			}
			map.get(end).add(start);			
		}
		
		public Boolean dfsUtil(int curr, int parent, int[] visited, int num) {
			
			visited[curr] = num;
			
			for(int currKey : map.get(curr)) {
				
				if(visited[currKey] == 0) {
					boolean isSubProb = dfsUtil(currKey, curr, visited, 3-num);
					if(isSubProb == false) return false;
				}
				else if(currKey != parent && num == visited[currKey]) {
					return false;
				}
			}
			
			return true;
		}
		
		public void dfs() {
			
			int[] arr = new int[map.size()];
			
			System.out.println("IS BIPARTITE ---> " + dfsUtil(0, -1, arr, 1) );
			
			
		}
		
	}

}
