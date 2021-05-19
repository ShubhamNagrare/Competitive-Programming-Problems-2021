package Heap;

import java.util.PriorityQueue;

public class Implement_A_Min_Heap {
	
	
	static PriorityQueue<Integer> queue = new PriorityQueue<>();
	
	public void implement(){
		
		queue.add(8);
		queue.add(5);
		queue.add(13);
		queue.add(2);
		queue.add(23);
		queue.add(16);	
		print();
		
		System.out.println("SIZE : " + queue.size());
		
		System.out.println("HEAD : " + queue.peek());
		
		System.out.println("REMOVE HEAD : " + queue.poll());
		
		System.out.println("REMOCE SPECIFIC ELEMENTS : " + queue.remove(16) );
		
		System.out.println("CHECK IF ELEMENT IS PRESENT : " + queue.contains(23));
		
	}
	
	private static void print() {
		System.out.println("Min Heap : ");
		
		for(Integer i : queue) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
