package Misclleneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class Graph_Single_Source_Shortest_Path {
	
	
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
	Map<Integer,List<Integer>> map;
	
	public Graph() {
		map = new HashMap<>();
	}
	
	
	
public void addEdge(int start, int end) {			
	if(!map.containsKey(start)) {
		map.put(start, new ArrayList<>());
	}
	map.get(start).add(end);
	if(!map.containsKey(end)) {
		map.put(end, new ArrayList<>());
	}
	map.get(end).add(start);		
}

	
	public void bfs(int src) {
				
		Queue<Integer> queue = new LinkedList<>();
		Map<Integer,Integer> dist = new HashMap<>();
		
		for(int c : map.keySet()) {
			dist.put(c, Integer.MAX_VALUE);
		}
		
		queue.add(src);
		dist.put(src, 0);
		
		while(!queue.isEmpty()) {
						
			int val = queue.poll();		
			for(int curr : map.get(val)) {
				
				if(dist.get(curr) == Integer.MAX_VALUE) {				
					queue.add(curr);
					int b = dist.get(val) + 1;
					dist.put(curr, b);			
				}
			}		
		}
		
		
		for(int h : map.keySet()) {
			System.out.println("From " + src + " to " + h + " distance is " + dist.get(h));
		}
}

	

}}
