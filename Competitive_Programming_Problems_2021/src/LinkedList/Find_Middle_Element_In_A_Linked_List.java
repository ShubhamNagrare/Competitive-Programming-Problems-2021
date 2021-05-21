package LinkedList;

public class Find_Middle_Element_In_A_Linked_List {
	
	public void solve() {
		
		LinkedList li = new LinkedList();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(5);
		li.insert(6);
		
		System.out.println(findMid(li));
	
	}
	
	private int findMid(LinkedList li) {
		
		Node root = li.getRoot();
		
		Node fast = root;
		Node slow = root;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.value;
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
			}
			else {
				
				Node curr = root;
				while(curr.next != null) {
					curr = curr.next;
				}
				
					curr.next = new Node(value);
				
			}
		}
		
	}

}
