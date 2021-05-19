package Queue;

public class Implement_A_Queue {
	
	
	
	
	class Queue{
		int size,front,rear;
		int arr[];
		
		public Queue(int size) {
			this.size = size;
			arr = new int[this.size];
			this.front = -1;
			this.rear = -1;
		}
	
	
	
	public boolean isFull() {
		if(front == 0 && rear == size -1) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int value) {
		
		if(isFull()) {
			
		}
		
	}
	
	
}

}
