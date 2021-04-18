package Start;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import Graph.Implement_Graph_Using_Adjacency_List;

public class Start {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
	//	printArray(Array.Reverse_The_Array.reverseArray(arr, arr.length));

		
//		Implement_Graph_Using_Adjacency_List<Integer, String> g = new Implement_Graph_Using_Adjacency_List<>();
//		g.addEdge(1, 2, "bro");
//		g.addEdge(2, 3, "sister");
//		g.addEdge(1, 3, "bro");
//		g.addEdge(1, 4, "aunt");
//		g.addEdge(4, 7, "mom");
//		g.addEdge(3, 8, "mom");
//		//g.addVertex(8);
//		
//		//g.deleteVertex(1);
//		
//		System.out.println(g);
//		
//		System.out.println(g.containsEdge(4,1));
//		
//		System.out.println();
//		
//		System.out.println(g.getVertexCount());
//		System.out.println(g.getEdgeCount());
//		
//		g.bfs(1);
//		
//		System.out.println();
//		g.dfs(4,7);
		
		
		//int[] aarr= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		//int[] aarr = {1, 4, 3, 2, 6, 7};
	//	int[] aarr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
		//Array.Min_no_of_jumps_to_reach_end_of_an_array.minJumps(aarr);
		
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
	    int n = a.length;  
		print(Array.Find_Largest_Sum_Contigous_SubArray.findLargestSum(a, n));
	

	}
	

	
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void print(int arr) {
			System.out.println(arr + " ");
	}
	
	
	



}
