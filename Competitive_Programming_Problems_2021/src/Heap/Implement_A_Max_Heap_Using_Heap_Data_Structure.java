package Heap;

public class Implement_A_Max_Heap_Using_Heap_Data_Structure {

	
	
	class MaxHeap{
		private int[] heap;
		private int size;
		private int maxsize;
		
		public MaxHeap(int size) {
			this.maxsize = size;
			this.size = 0;
			heap = new int[this.maxsize+1];
			heap[0] = Integer.MAX_VALUE;
		}
		
		
		public void insert(int element) {
			size++;
			heap[size] = element;
			
			int current = size;
			heapifyUp(current);
		}
		
		private void heapifyUp(int pos) {
			
			int temp = heap[pos];
			while(pos > 0 &&  temp > heap[parent(pos)]) {
				heap[pos] = heap[parent(pos)];
				pos = parent(pos);
			}
			heap[pos] = temp;
		}
		
		
		
		
		
		
		
		private int parent(int pos) {
			return pos/2;
		}
		
		
		
		
	}
	
	
	
}
