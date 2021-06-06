package Graph;

import java.util.*;

public class Single_Source_Shortest_Path {

	public void findSingleShortestPath() {
		
		Graph<Integer> g = new Graph<>();		
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(0,3);
		g.addEdge(4,5);
				
		g.bfs(0);			
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
	
	
	
	public void bfs(K src) {
		
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
				//	int h = dist.get(curr);
					int h = dist.get(c) + 1;
					dist.put(curr, h);
				}	
			}		
		}
		
		
		for(K ks : l.keySet()) {
			
			int d = dist.get(ks);
			System.out.println("Node  " + ks + " Dist from src -> " + d);
		}		
	}
	
		
}	
}
