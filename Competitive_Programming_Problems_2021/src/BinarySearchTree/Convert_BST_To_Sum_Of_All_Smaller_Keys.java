package BinarySearchTree;


public class Convert_BST_To_Sum_Of_All_Smaller_Keys {
	
	// https://www.geeksforgeeks.org/bst-tree-sum-smaller-keys/#:~:text=The%20Node%20which%20is%20being,visited%20are%20all%20smaller%20keys.
	
public void implement() {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(9);
		tree.add(16);
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(19);
		tree.add(12);
		tree.add(99);
		System.out.println("Printing First Tree --> ");
		tree.inOrder();
		
		System.out.println();
		tree.maximize();
		System.out.println("Printing First Tree --> ");
		tree.inOrder();
		
	}
	
	class Node{
		int value;
		Node left,right;
						
		public Node(int value) {
			this.value = value;
			left = right = null;
		}
	}
	
	class BinarySearchTree{
		Node root;
		int count = 0;
		
		public void inOrder() {
			traverse(root);
		}
		
		private void traverse(Node current) {
			if(current != null) {
				traverse(current.left);
				System.out.println(" "+ current.value);
				traverse(current.right);
			}			
		}
		
		public void maximize() {
			maximize(root);
		}
		
		private void maximize(Node current) {
			
			if(current != null) {
				maximize(current.left);
				count += current.value;
				current.value = count;
				maximize(current.right);
			}		
		}
		
		private Node addRecurssive(Node current, int value) {
			
			if(current == null) {
				return new Node(value);
			}
			
			if(value<current.value) {
				current.left = addRecurssive(current.left, value);
			}else if(value > current.value) {
				current.right = addRecurssive(current.right, value);	
			}
			return current;
		}
		
		public void add(int value) {
			root = addRecurssive(root, value);
		}
		
	}
	
	

}
