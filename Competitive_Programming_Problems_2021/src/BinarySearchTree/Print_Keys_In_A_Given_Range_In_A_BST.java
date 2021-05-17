package BinarySearchTree;


public class Print_Keys_In_A_Given_Range_In_A_BST {
	
	//https://www.geeksforgeeks.org/print-bst-keys-in-the-given-range/
	
public void solve() {
		
		BST tree1 = new BST();
		tree1.add(11);
		tree1.add(2);
		tree1.add(29);
		tree1.add(1);
		tree1.add(7);
		tree1.add(15);
		tree1.add(40);
		tree1.add(35);
		System.out.println("Printing First Tree --> ");
		tree1.inOrder();
		
		System.out.println();
		System.out.println("After Replacing with Max Sum --> ");
		tree1.printInnOrder(7, 35);
				
	}
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left = right = null;
		}
	}
	
	class BST{
		Node root;
		
		
		public void add(int value) {
			root = addRecursive(root, value);
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
		
		
		public void printInnOrder(int start, int end) {
			traversePrintInOrder(root, start, end);
		}
		
		private void traversePrintInOrder(Node current, int start, int end) {
			if(current != null) {
				traversePrintInOrder(current.left, start, end);
				if(current.value > start && current.value < end) {
					System.out.println(" " + current.value);
				}
				traversePrintInOrder(current.right, start, end);
			}
		}
		
	}

}
