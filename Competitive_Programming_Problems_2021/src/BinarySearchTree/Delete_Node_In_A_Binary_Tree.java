package BinarySearchTree;


public class Delete_Node_In_A_Binary_Tree {
	
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
		
		tree.inOrder();
		System.out.println();
		System.out.println();
		
		tree.delete(7);
		tree.inOrder();
		System.out.println();
		System.out.println();
	}
	
	class Node{
		int value;
		Node left,right;
		
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
				current.left = addRecursive(current.left, value);
			}
			else if(value > current.value) {
				current.right = addRecursive(current.right, value);
			}
			else {
				return current;
			}
			return current;
		}
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		
		private Node deleteRecursive(Node current, int value) {
			
			if(current == null) {
				return null;
			}
			
			if(value == current.value) {
				
				if(current.left == null && current.right == null) {
					return null;
				}
				
				if(current.right == null) {
					return current.left;
				}
				
				if(current.left == null) {
					return current.right;
				}
				
				int smallestValue = getSmallestValue(current.right);
				current.value = smallestValue;
				current.right = deleteRecursive(current.right, smallestValue);
				return current;		
			}
						
			if(value < current.value ) {
				current.left =  deleteRecursive(current.left, value);
			}
				current.right = deleteRecursive(current.right, value);
			return current;
		}
		
		private int getSmallestValue(Node current) {
			return current.left == null ? current.value : getSmallestValue(current.left);
		}
		
		
		
		
		
//		private Node deleteRecursive(Node current, int value) {
//			
//			if(current == null) {
//				return null;
//			}
//			
//			if(value == current.value) {
//				
//				if(current.left == null && current.right == null) {
//					return null;
//				}
//				
//				if(current.left == null) {
//					return current.right;
//				}
//				
//				if(current.right == null) {
//					return current.left;
//				}
//				
//				int smallestValue = findSmallestValue(current.right);
//				current.value = smallestValue;
//				current.right = deleteRecursive(current.right, smallestValue);
//				return current;				
//			}
//			
//			if(value < current.value) {
//				current.left = deleteRecursive(current.left, value);
//			}
//			current.right = deleteRecursive(current.right, value);
//			return current;
//		}
//		
		 
		
//		private int findSmallestValue(Node current) {
//			return current.left == null ? root.value : findSmallestValue(current.left);
//		}
		
		public void delete(int value) {
			root = deleteRecursive(root, value);
		}
		
		private void traverseInOrder(Node current) {
			if(current != null) {
				traverseInOrder(current.left);
				System.out.print(" " + current.value);
				traverseInOrder(current.right);			
			}
		}
		
		public void inOrder() {
			traverseInOrder(root);
		}
	}

}
