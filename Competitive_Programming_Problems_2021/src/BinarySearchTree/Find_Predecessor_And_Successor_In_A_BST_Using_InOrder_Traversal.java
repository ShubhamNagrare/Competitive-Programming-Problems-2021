package BinarySearchTree;

public class Find_Predecessor_And_Successor_In_A_BST_Using_InOrder_Traversal {
	
	
	// NOT COMPLETED TODO
	
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
		
		tree.inOrderPreceddorSuccessor(16);
		
	}
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value=value;
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
		
		
		public void inOrderPreceddorSuccessor(int value) {
			
			travsereAndPrint(root, value, null);
		}
		
		private Node travsereAndPrint(Node current, int value, Node prev) {
			
			if(current != null) {
				
				// Successor
				if(current.value == value) {
					if(root.right != null) {
						return findMinimun(root.right);
					}				
				}
				
			
										
			}	
			return null;
		}
		
		private Node findMinimun(Node root) {
			
			while(root.left != null) {
				root = root.left;
			}
			return root;
		}
		
		
		
		
		
	}

}
