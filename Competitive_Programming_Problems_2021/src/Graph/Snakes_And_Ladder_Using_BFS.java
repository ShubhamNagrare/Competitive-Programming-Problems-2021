package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Snakes_And_Ladder_Using_BFS {

	
	
	public void getShortestPath() {
		Graph<Integer> g = new Graph<>();
		
		int[] board = new int[50];
		board[2] = 13;
		board[5] = 2;
		board[9] = 18;
		board[18] = 11;
		board[17] = -13;
		board[24] = -8;
		board[20] = -14;
		board[25] = 10;
		board[32] = -2;
		board[34] = -22;
		
		for(int i=0; i<=36; i++) {
			for(int dice=0; dice<=6; dice++) {
				int j = i + dice;
				j += board[i];
				
				if(j<=36) {
					g.addEdge(i, j);
				}		
			}
		}
		g.addEdge(36, 36);

		System.out.println( g.bfs(0, 36) );
		
		
		
	}
	
	
	

private class Graph<K>{
	Map<K,List<K>> l = null;
	
	public Graph() {
		l = new HashMap<>();
	}
	
	
	public void addEdge(K start, K end) {
		
		if(!l.containsKey(start)) {
			l.put(start, new ArrayList<K>());
		}		
		l.get(start).add(end);
		
		if(!l.containsKey(end)) {
			l.put(end, new ArrayList<K>());
		}		
		l.get(end).add(start);
	}
	
	public boolean addVertex(K key){
		if(!l.containsKey(key)) {
			l.put(key, new ArrayList<>());
			return true;
		}
		return false;
	}
	
	
	
	public int bfs(K src, K destination) {
		
		Queue<K> q = new LinkedList<>();
		Map<K,Integer> dist = new HashMap<>();
		
		for(K curr : l.keySet()) {		
			dist.put(curr, Integer.MAX_VALUE);
		}
		
		q.add(src);
		int currVal = dist.get(src);
		currVal = 0;
		dist.put(src, currVal);
		
		while(q.size() != 0) {
			
			K c = q.poll();
			
			for(K curr : l.get(c) ) {
				
				if(dist.get(curr) == Integer.MAX_VALUE) {
					q.add(curr);
					int h = dist.get(curr);
					h = dist.get(c) + 1;
					dist.put(curr, h);
				}	
			}		
		}
		
		return dist.get(destination);
			
	}
	
		
		
	}	
}













