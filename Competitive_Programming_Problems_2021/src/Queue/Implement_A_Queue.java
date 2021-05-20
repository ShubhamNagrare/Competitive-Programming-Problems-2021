package Queue;

public class Implement_A_Queue {
	
	
	class Queue{
		private int[] arr;
		private int front,rear;
		private int capacity,count;
		
		public Queue(int capacity) {
			this.capacity = capacity;
			arr = new int[this.capacity];
			front=0;
			rear = -1;
			count = 0;
		}
		
		public int size() {
			return count;
		}
		
		public boolean isFull() {
			return  (size() == capacity);
		}
		
		public boolean isEmpty() {
			return (size() == 0);
		}
		
		
		public void enqueue(int value) {
			
			if(isFull()) {
				System.out.println("Queue is full");
				return;
			}
			
			System.out.println("Inserting Item : " + value);
			rear = (rear + 1) % capacity;
			arr[rear] = value;
			count++;			
		}
		
		
		public void dequeue() {
			
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return;
			}
			
			System.out.println("Removing Front : " + arr[front]);
			front = (front-1) % capacity;
			count--;
		}
		
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				System.exit(1);
			}
			return arr[front];
		}
		
		
		
		
	}

}
