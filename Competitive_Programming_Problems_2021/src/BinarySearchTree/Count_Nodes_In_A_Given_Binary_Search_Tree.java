package BinarySearchTree;


public class Count_Nodes_In_A_Given_Binary_Search_Tree {
	
	
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
		
		tree.getNodeCount();
		
	}
		
	
	class Node{
		int value;
		Node left,right;
		
		public Node(int value) {
			left = right = null;
		}
	}
	
	class BinarySearchTree{
		Node root;
		int count = 0;
		
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
			current.right = addRecursive(current.right, value);
			return current;
		}
		
		public void getNodeCount() {
			getCount(root);
		}
		
		private void getCount(Node current) {
			if(current != null) {
				count(root);	
				System.out.println(count);
			}
		}
		
		private void count(Node current) {			
			if(current != null) {
				
				count(current.left);
				count++;
				count(current.right);
			}
		}
	}

}
