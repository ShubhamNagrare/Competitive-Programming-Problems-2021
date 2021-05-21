package LinkedList;

public class Find_Middle_Element_In_A_Linked_List {
	
	public void solve() {
		
		LinkedList li = new LinkedList();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(5);
		
		System.out.println(findMid(li));
	
	}
	
	private int findMid(LinkedList li) {
		
		Node root = li.getRoot();
		
		int a = 0,  b = 0;
		Node curr1 = root;
		Node curr2 = root;
		while(curr2 != null) {
			
			a = curr1.value;
			curr1 = curr1.next;
			
			b = curr2.value;
			curr2 = curr2.next.next;
		}
		return a;
	}
	
	
	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
			next = null;
		}
	}
	
	class LinkedList{
		Node root;
		int size = 1;
		
		public Node getRoot() {
			return root;
		}
		
		public void insert(int value) {
			if(root == null) {
				root = new Node(value);
				size++;
			}
			else {
				
				Node curr = root;
				while(curr != null) {
					curr = curr.next;
				}
				
				if(curr == null) {
					curr = new Node(value);
					size++;
				}
				
			}
		}
		
	}

}
