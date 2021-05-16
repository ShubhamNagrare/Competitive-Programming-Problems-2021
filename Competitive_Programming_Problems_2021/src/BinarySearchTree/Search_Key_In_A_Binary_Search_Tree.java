package BinarySearchTree;


public class Search_Key_In_A_Binary_Search_Tree {
	
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
		
		System.out.println(tree.search(9).value);
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
		
		private Node addRecursive(Node current, int value) {
			
			if(current == null) {
				return new Node(value);
			}
			
			if(value < current.value) {
				current.left  = addRecursive(current.left, value);
			}
			else if(value > current.value) {
				current.right = addRecursive(current.right, value);
			}
			return current;
		}
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		private Node search(Node current, int value) {
			
			if(current == null) {
				return null;
			}
			
			if(current.value == value) {
				return current;
			}
			
			if(value < current.value) {
				return  search(current.left, value);
			}
			else if(value > current.value) {
				return search(current.right, value);
			}
			return current;
		}
		
		public Node search(int value) {
			return search(root, value);
		}
		
	}

}
