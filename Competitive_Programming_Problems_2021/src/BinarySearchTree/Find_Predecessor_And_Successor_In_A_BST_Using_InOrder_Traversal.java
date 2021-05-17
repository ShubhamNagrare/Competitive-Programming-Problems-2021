package BinarySearchTree;


public class Find_Predecessor_And_Successor_In_A_BST_Using_InOrder_Traversal {
	
	
	// https://www.geeksforgeeks.org/inorder-successor-in-binary-search-tree/#:~:text=In%20Binary%20Tree%2C%20Inorder%20successor,key%20of%20the%20input%20node.
	
	public void implement() {
		
		BinaryTree tree = new BinaryTree();
		tree.add(20);
		tree.add(8);
		tree.add(22);
		tree.add(4);
		tree.add(12);
		tree.add(10);
		tree.add(14);
		
		System.out.println("InOrder print --> ");
		tree.inOrder();
		
		System.out.println();
		System.out.println("Find and print --> ");
		tree.inOrderPreceddorSuccessor(22);
		
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
		int prev;
		
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
			prev = -1;
			travsereAndPrint(root, value);
		}
		
		private void travsereAndPrint(Node current, int value) {			
			if(current != null) {				
				travsereAndPrint(current.left, value);
				
				if(value == current.value) {
					System.out.println("Preceddor : " +  prev);
					int succ = current.right != null ? current.right.value : -1;
					System.out.println("Successor : " + succ);
				}
				prev = current.value;			
				travsereAndPrint(current.right, value);									
			}
		}
		

		
		public void inOrder() {
			traverseInOrder(root);
		}
		
		private void traverseInOrder(Node current) {
			if(current != null) {
				traverseInOrder(current.left);
				System.out.print(" " + current.value);
				traverseInOrder(current.right);
			}
		}
		
		
		
		
	}

}
