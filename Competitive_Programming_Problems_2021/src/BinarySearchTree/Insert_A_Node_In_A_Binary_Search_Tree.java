package BinarySearchTree;


public class Insert_A_Node_In_A_Binary_Search_Tree {
	
	public void solve() {
		
		System.out.println("Constructing a Binary Tree :");
		BinaryTree tree = new BinaryTree();
		tree.add(6);
		tree.add(4);
		tree.add(8);
		tree.add(30);
		tree.add(15);
		tree.add(72);
		tree.add(19);
		
		System.out.println();
		System.out.println("Printing Binary Tree :");
		tree.inOrder();
		
		System.out.println();
		System.out.println("Adding a Node in Binary Tree :");
		tree.add(35);
		
		System.out.println();
		System.out.println("Printing NEW Binary Tree :");
		tree.inOrder();
		
	}
	
	
	
	class Node{
		int value;
		Node left, right;
		public Node(int value) {
			this.value = value;
			left=right=null;
		}
	}
	
	class BinaryTree{
		Node root;
		
		private Node addRecursive(Node current, int value){
			
			if(current == null) {
				return new Node(value);
			}
			
			if(value < current.value) {
				current.left =  addRecursive(current.left, value);
			}
			else if(value > current.value) {
				current.right =  addRecursive(current.right, value);
			}
			return current;
		}
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		public void inOrder() {
			traverseInOrder(root);
		}
		
		private void traverseInOrder(Node current) {
			if(current != null) {
				traverseInOrder(current.left);
				System.out.println(" " + current.value);
				traverseInOrder(current.right);
			}
		}
		
		
		
		
	}
	
	
	

}
