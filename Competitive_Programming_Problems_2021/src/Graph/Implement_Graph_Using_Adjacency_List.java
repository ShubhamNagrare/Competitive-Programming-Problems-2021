package Graph;

import java.util.*;
import java.util.Map.Entry;

class Node<K,E>{
	K key =null;
	K endNode  = null;
	E edgeLabel =null;
	
	public Node(K key, K endNode, E edgeLable) {
		this.key = key;
		this.endNode = endNode;
		this.edgeLabel = edgeLable;
	}
}

public class Implement_Graph_Using_Adjacency_List<K,E> {

	
	Map<K, List<Node<K,E>>> map = null;
	
	public Implement_Graph_Using_Adjacency_List() {
		map = new HashMap<>();
	}
	
	public void addEdge(K source, K target, E edgeLabel) {
		if(! map.containsKey(source)) {
			map.put(source, new ArrayList<>());
		}
		
		if(! map.containsKey(target)) {
			map.put(target, new ArrayList<>());
		}
		
		map.get(source).add(new Node<>(source, target, edgeLabel));		
	}
	
	
	// Update vertex
	// Update Edge
	// bfs
	
	public boolean dfsUtil(K start, K end, HashSet<K> visited) {
		if(start == end) return true;
		
		for(Node<K,E> curr : map.get(start)) {
			if(!visited.contains(curr.endNode)) {
				visited.add(curr.endNode);
				boolean isConnected = dfsUtil(curr.endNode, end, visited);
				if(isConnected) return true;
			}			
		}
		return false;
	}
	
	public void dfs(K start, K end) {
		HashSet<K> visited = new HashSet<>();
		visited.add(start);
		System.out.println(dfsUtil(start, end, visited));
	}
	
	
	public void bfs(K start) {
		if(map != null) {		
			Set<K> visited = new HashSet<>();
			Queue<K> queue = new LinkedList<K>();
			visited.add(start);
			queue.add(start);
			
			while(queue.size() != 0) {				
				start = queue.poll();
				System.out.print(start + "  ");
				for(Node<K,E> curr : map.get(start)) {		
					if(! visited.contains(curr.endNode) ) {
						visited.add(curr.endNode);
						queue.add(curr.endNode);
					}					
					}
				}			
			}			
		}
	
	
	
	public void deleteVertex(K val) {
		if(map != null) {
			map.remove(1);
		}
	}
	
	public void updateVertex(K oldVertex, K newVertex) {
		if(map != null) {
			deleteVertex(oldVertex);
			//addEdge(newVertex)
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean addVertex(K val) {
		if(map.containsKey(val)) {
			return false;
		}
		map.put(val, new ArrayList<>());
		return true;
	}
	
	public boolean containVertex(K val) {
		
		if(map != null) {
		 return map.containsKey(val);
		}
		return false;
		
	}
	
	
	public boolean containsEdge(K v1, K v2) {
		if(map != null) {
			
			if(map.containsKey(v1)) {
				List<Node<K,E>> list = map.get(v1);
				for(Node<K,E> currentVal : list) {
					if(currentVal.endNode == v2) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public int getVertexCount() {
		if(map != null) {
			return map.keySet().size();
		}
		return -1;
	}
	
	
	public int getEdgeCount() {
		if(map != null) {
			int count =0;
			for(K key : map.keySet()) {			
				count += map.get(key).size();
			}
			return count;
		}
		return -1;
	}
	
	
	@Override
	public String toString() {
		String data  = "";
		
		for(K key : map.keySet()) {
			List<Node<K,E>> h =  map.get(key);
			System.out.print(key + "===> ");
			for(Node<K,E> g : h) {
				System.out.print( g.endNode + " ");
			}
			System.out.println();
		}
		return data;

	}
	
	

}




