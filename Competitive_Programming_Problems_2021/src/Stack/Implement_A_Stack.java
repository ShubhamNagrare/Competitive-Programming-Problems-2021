package Stack;

public class Implement_A_Stack {
	
	public void implement() {
		Stack s = new Stack(3);
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.printStack();
		
		System.out.println();
		s.pop();
		s.printStack();
		
	}
	
	
	
	
	class Stack{
		private int[] arr;
		private int top;
		private int capacity;
		
		public Stack(int capacity) {
			this.capacity = capacity;
			arr = new int[capacity];
			top = -1;
		}
		
		public boolean isFull() {
			return top == capacity-1;
		}
		
		public boolean isEmpty() {
			return top == -1;
		}
		
		public void push(int value) {			
			if(isFull()) {
				System.out.println("Stack is Full !!");
				return;
			}			
			System.out.println("Element Added : " + value);
			arr[++top] = value;						
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("Stack is Empty !!");
				return -1;
			}
			System.out.println("Element Poping..");
			return arr[top--];
		}
		
		public int getSize() {
			return top+1;
		}
		
		
		public void printStack() {
			for(int i=0; i<=top; i++) {
				System.out.println(arr[i] + ", ");
			}		
		}
		
		
		
		
	}
	
	

}
