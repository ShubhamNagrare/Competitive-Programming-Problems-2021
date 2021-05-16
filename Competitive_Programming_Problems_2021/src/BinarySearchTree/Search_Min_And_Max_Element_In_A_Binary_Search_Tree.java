package BinarySearchTree;

public class Search_Min_And_Max_Element_In_A_Binary_Search_Tree {
	
	public void implement() {
		
		BinaryTree tree = new BinaryTree();
		tree.add(9);
		tree.add(16);
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(19);
		tree.add(12);
		
		Search_Min_And_Max_Element_In_A_Binary_Search_Tree m = new Search_Min_And_Max_Element_In_A_Binary_Search_Tree();
		m.find(tree);
	}
	
	
	public void find(BinaryTree tree) {
		Node root = tree.getRoot();
		
		System.out.println(getMin(root).value);
		System.out.println();
		System.out.println(getMax(root).value);
	}
	
	private Node getMin(Node root) {
		
		if(root == null) {
			return null;
		}
		
		if(root.left == null) {
			return root;
		}
		return getMin(root.left);
	}
	
	private Node getMax(Node root) {
		
		if(root == null) {
			return null;
		}
		
		if(root.right == null) {
			return root;
		}
		return getMax(root.right);
	}
	
	
	
	class Node{
		int value;
		Node left, right;
		
		public Node(int value) {
			this.value = value;
			left = right = null;
		}
	}
	
	class BinaryTree{
		Node root;
		
		public Node getRoot() {
			return root;
		}
		
		private Node addRecursive(Node current, int value) {
			
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
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		
	}

}
