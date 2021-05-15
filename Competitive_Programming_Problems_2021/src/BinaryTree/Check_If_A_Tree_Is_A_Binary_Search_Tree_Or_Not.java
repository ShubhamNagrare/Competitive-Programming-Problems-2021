package BinaryTree;


public class Check_If_A_Tree_Is_A_Binary_Search_Tree_Or_Not {
	
	public void implement() {
		
		BinaryTree tree = new BinaryTree();
		
//		tree.root = new Node(1);
//		tree.root.right = new Node(7);
//		tree.root.right.right = new Node(6);
//		tree.root.right.right.right = new Node(5);
//		tree.root.right.right.right.right = new Node(9);
//		tree.root.right.right.right.right.right = new Node(2);
//		tree.root.right.right.right.right.right.right = new Node(6);
		
//		tree.root = new Node(2);
//		tree.root.left = new Node(1);
//		tree.root.right = new Node(3);
		
		tree.root = new Node(1);
		tree.root.left = new Node(1);
		tree.root.right = new Node(1);
		tree.root.left.left  = new Node(1);
		tree.root.left.right  = new Node(1);
		tree.root.left.left.left  = new Node(1);
		tree.root.left.left.right  = new Node(1);
		tree.root.left.right.left  = new Node(1);
		tree.root.left.right.right  = new Node(1);
		tree.root.left.left.left.left  = new Node(1);
		
		System.out.println(isBST(tree.root));
	}
	
	
	public boolean isBST(Node current) {
		
		if(current == null) {
			return true;
		}
		
		
		if(current.left != null && current.left.value > current.value) {
			return false;
		}
		
		if(current.right != null && current.right.value < current.value) {
			return false;
		}
		
			return isBST(current.left) || isBST(current.right);
	}
	
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
		}
	}
	
	
	class BinaryTree{
		Node root;
		
		public BinaryTree(int value) {
			root = new Node(value);
		}	
		
		public BinaryTree() {
			root = null;
		}
	}
	
	
	
	
	

}
