package LinkedList;

import javax.xml.bind.ValidationEvent;

class LinkedList{
	public Node head;
	
	 class Node{
			public int value;
			public Node next;
			
			public Node(int value) {
				this.value = value;
				next = null;
			}
		}
	 
	 public LinkedList() {
		 
	 }
	
	
	public void insert( int data) {
		
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
		}else {
			Node prev = head;
			while(prev.next != null) {
				prev = prev.next;
			}
			
			prev.next = newNode;
		}
	}
	
	
	public void print() {		
		if(head == null) {
			return;
		}
		
		Node curr = head;
		while(curr.next != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}	
		System.out.println(curr.value);
	}
	
	
	
	public void deleteByKey(int key) {
		if(head == null) {
			return;
		}
		
		Node curr = head;
		Node prev = null;
		
		// If head holds the key 
		if(curr != null && curr.value == key) {
			head = curr.next;
			System.out.println("Deleted : " + key);
		}
		
		// Key is present somewhere else
		while(curr != null && curr.value != key) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr != null) {
			prev.next = curr.next;
			System.out.println("Deleted : " + key);
		}
		
		
		//If key is not present
		if(curr == null) {
			System.out.println("Not Found");
		}	
	}
	
	
	public void deleteByPosition(int index) {
		if(head == null || index < 0) {
			return;
		}
		
		Node curr= head;
		Node prev = null;
		
		
		// position 0 
		if(curr != null && index == 0) {
			head = curr.next;	
			return;
		}
		
		
		int i = 0;
		while(i != index) {
			prev = curr;
			curr = curr.next;		
			i++;
		}
		
		prev.next = curr.next;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}


public class Implement_A_Linked_List {

	
	public static void create() {
		
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		
		ll.print();
		
		ll.deleteByKey(3);
		
		ll.print();
		
ll.deleteByKey(5);
		
		ll.print();
		
ll.deleteByPosition(0);
		
System.out.println();
		ll.print();
		
		
		
		
	}

	
	
	
}
