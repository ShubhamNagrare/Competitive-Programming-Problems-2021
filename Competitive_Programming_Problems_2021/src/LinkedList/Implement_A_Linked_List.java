package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class Implement_A_Linked_List{
	
	public void solve() {
		LL l = new LL();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		//l.insert(3);
		
		System.out.println(l.detectLoop());
	}
	
	
	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	
	class LL{
		
		Node head;
		
		public void insert(int data) {			
			if(head == null) {
				head = new Node(data);
			}
			else {
				Node prev  = head;
				
				while(prev.next != null) {
					prev = prev.next;
				}
				prev.next = new Node(data);
			}			
		}
		
		
		public void deleteByKey(int key) {
			
			if(head == null) {
				return;
			}
			else {
				if(head != null && head.value == key) {
					head = head.next;
				}
				
				Node prev = null;
				Node current = head;
				while(current != null && current.value != key) {					
					prev = current;
					current = current.next;
				}
				
				if(current != null) {
					prev.next = current.next;
				}
				else {
					System.out.println("Not found");
				}				
			}
		}
			
			public void deleteByIndex(int index){
				
				if(head == null) {
					return;
				}
				
				if(head.next == null && index == 0) {
					head = null;
				}
				else {
					
					int position = 0;
					Node prev  = null;
					Node curr = head;
					
					while(position == index && curr != null) {
						prev = curr;
						curr = curr.next;						
					}
					
					if(position == index) {
						prev.next = curr.next;
					}
					else {
						System.out.println("NOT FOUND");
					}					
				}
			}
			
			
			
			public void reverseAndPrint() {
				
				if(head == null) {
					return;
				}
				
				if(head.next == null) {
					return;
				}
				else {
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
					
					Node n = head;
					while(n != null) {
						System.out.print(" " + n.value);	
						n = n.next;
					}
						
				}	
			}
			
			
			
			public boolean detectLoop() {
				if(head == null) {
					return false;
				}
				
				
				Node curr = head;
				Map<Integer,Boolean> map = new HashMap<>();
				
				while(curr != null) {		
					if(!map.containsKey(curr.value)) {
						map.put(curr.value, true);
						curr = curr.next;
					}else {
						return true;
					}		
				}
				return false;
			}
			
			
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public Node head;
//	
//	 class Node{
//			public int value;
//			public Node next;
//			
//			public Node(int value) {
//				this.value = value;
//				next = null;
//			}
//		}
//	 
//	 public LinkedList() {
//		 
//	 }
//	
//	
//	public void insert( int data) {
//		
//		Node newNode = new Node(data);
//		newNode.next = null;
//		
//		if(head == null) {
//			head = newNode;
//		}else {
//			Node prev = head;
//			while(prev.next != null) {
//				prev = prev.next;
//			}
//			
//			prev.next = newNode;
//		}
//	}
//	
//	
//	public void print() {		
//		if(head == null) {
//			return;
//		}
//		
//		Node curr = head;
//		while(curr.next != null) {
//			System.out.println(curr.value);
//			curr = curr.next;
//		}	
//		System.out.println(curr.value);
//	}
//	
//	
//	
//	public void deleteByKey(int key) {
//		if(head == null) {
//			return;
//		}
//		
//		Node curr = head;
//		Node prev = null;
//		
//		// If head holds the key 
//		if(curr != null && curr.value == key) {
//			head = curr.next;
//			System.out.println("Deleted : " + key);
//		}
//		
//		// Key is present somewhere else
//		while(curr != null && curr.value != key) {
//			prev = curr;
//			curr = curr.next;
//		}
//		
//		if(curr != null) {
//			prev.next = curr.next;
//			System.out.println("Deleted : " + key);
//		}
//		
//		
//		//If key is not present
//		if(curr == null) {
//			System.out.println("Not Found");
//		}	
//	}
//	
//	
//	public void deleteByPosition(int index) {
//		if(head == null || index < 0) {
//			return;
//		}
//		
//		Node curr= head;
//		Node prev = null;
//		
//		
//		// position 0 
//		if(curr != null && index == 0) {
//			head = curr.next;	
//			return;
//		}
//		
//		
//		int i = 0;
//		while(i != index) {
//			prev = curr;
//			curr = curr.next;		
//			i++;
//		}
//		
//		prev.next = curr.next;
//		
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
//
//
//public class Implement_A_Linked_List {
//
//	
//	public static void create() {
//		
//		LinkedList ll = new LinkedList();
//		ll.insert(1);
//		ll.insert(2);
//		ll.insert(3);
//		ll.insert(4);
//		ll.insert(5);
//		
//		ll.print();
//		
//		ll.deleteByKey(3);
//		
//		ll.print();
//		
//ll.deleteByKey(5);
//		
//		ll.print();
//		
//ll.deleteByPosition(0);
//		
//System.out.println();
//		ll.print();
//		
//		
//		
//		
//	}

	
	
	
}
