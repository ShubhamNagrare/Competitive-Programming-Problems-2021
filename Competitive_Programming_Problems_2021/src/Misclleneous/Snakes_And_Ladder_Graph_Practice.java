package Misclleneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Snakes_And_Ladder_Graph_Practice {
	
	
	public void solve() {
		
		
		Graph g = new Graph();
		
		int[] board = new int[50];		
		board[2] = 13;
		board[5] = 2;
		board[9] = 18;
		board[17] = -13;
		board[18] = 11;
		board[20] = -14;
		board[24] = -8;
		board[25] = 10;
		board[32] = -2;
		board[34] = -22;
		
		for(int i=0; i<=36; i++) {
			for(int dice =0; dice <= 6; dice ++) {			
				int j = i+dice;
				j += board[i];
				if(j <= 36) {
					g.addEdge(i, j);
				}
			}
		}
		g.addEdge(36, 36);
		System.out.println(g.dfs(0, 36));

		
		
		
		
	}
	
	
	
	
	
	class Graph{
		
		Map<Integer, List<Integer>> map = null;
		
		public Graph() {
			map = new HashMap<>();
		}
		
		
		
		public void addEdge(int src, int dest) {			
			if(!map.containsKey(src)) {
				map.put(src, new ArrayList<Integer>());
			}
			map.get(src).add(dest);
			
			if(!map.containsKey(dest)) {
				map.put(dest, new ArrayList<Integer>());
			}
			map.get(dest).add(src);			
		}

		
		
		
		public int dfs(int src, int destination) {
			
			Queue<Integer> queue = new LinkedList<>();
			Map<Integer,Integer> dist = new HashMap<>();
			
			for(int currMap : map.keySet()) {
				dist.put(currMap, Integer.MAX_VALUE);
			}
			
			queue.add(src);
			dist.put(src, 0);
			
			while(!queue.isEmpty()) {
				
				int val = queue.poll();
				for(int curr : map.get(val)) {					
					if(dist.get(curr) == Integer.MAX_VALUE) {
						queue.add(curr);
						int h = dist.get(val) + 1;
						dist.put(curr, h);
					}			
				}	
			}
			
			
			return dist.get(destination);
			
			
		}
		
		
		
		
	}

}
