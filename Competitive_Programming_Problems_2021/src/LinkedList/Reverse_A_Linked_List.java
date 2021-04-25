package LinkedList;



class LinkedListt{
	
	public Node head = null;
	
	class Node{	
		public int value;
		public Node next;
		
		public Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	
	
	public void insert(int value) {
		Node newNode = new Node(value);		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node prev = head;
		while(prev.next != null) {
			prev = prev.next;
		}		
		prev.next = newNode;
	}
	
	
	public void print() {
		if(head == null) {
			return;
		}
		Node curr = head;
		
		while(curr.next != null) {
			System.out.println("Current -> " + curr.value) ;
			curr = curr.next;
		}
		System.out.println("Current -> " + curr.value) ;	
	}
	
	public void reverseIterative() {
		if(head == null	) {
			return;
		}
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;		
		}		
		head = prev;
	}
	

}


public class Reverse_A_Linked_List {
	
	
	
	
	
	public static void iterative() {
		
		//define a linkedList
		LinkedListt l = new LinkedListt();
		l.insert(1);
		l.insert(2);
		l.insert(3);	
		l.print();
		
		System.out.println();
		l.reverseIterative();		
		l.print();
		
		
		
		
		
		
		
		
	}
	

	
}
