package BinarySearchTree;


public class Find_Kth_Largest_Element_In_A_BST {
	
public void solve() {
		
		BST tree1 = new BST();
		tree1.add(9);
		tree1.add(16);
		tree1.add(5);
		tree1.add(3);
		tree1.add(7);
		tree1.add(2);
		tree1.add(19);
		tree1.add(12);
		tree1.add(99);
		System.out.println("Printing First Tree --> ");
		tree1.inOrder();
		
		System.out.println();
		System.out.println();
		int k = 2;
		System.out.println(tree1.getKthLargest(k));
				
	}


	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left = right= null;
		}
	}
	
	class BST{
		Node root;
		int kthlargest;
		int key;
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		private Node addRecursive(Node current, int value){
			if(current == null) {
				return new Node(value);
			}
			
			if(value < current.value) {
				current.left = addRecursive(current.left, value);
			}
			else if(value > current.value) {
				current.right = addRecursive(current.right, value);
			}
			return current;	
		}
		
		public void inOrder() {
			traverseinOrder(root);
		}
		
		
		private void traverseinOrder(Node current) {
			if(current != null) {
				traverseinOrder(current.left);
				System.out.print(" " + current.value);
				traverseinOrder(current.right);
			}
		}
		
		
		public int getKthLargest(int key) {
			this.key = key;
			kthlargest = -1;
			kthLargest(root);
			return kthlargest;
		}
		
		private void kthLargest(Node current){
			if(current != null) {
				
				if(key <= 0) {
					return;
				}
				
				kthLargest(current.right);
				key--;
				if(key==0) {
					kthlargest = current.value;
					return;
				}							
				kthLargest(current.left);
			}
		}
		
		
		
	}
	
	
	

}
