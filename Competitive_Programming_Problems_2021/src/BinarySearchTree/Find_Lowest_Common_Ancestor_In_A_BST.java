package BinarySearchTree;

import BinarySearchTree.Find_Kth_Largest_Element_In_A_BST.BST;

public class Find_Lowest_Common_Ancestor_In_A_BST {
	
	public void solve() {
		
		BST tree1 = new BST();
		tree1.add(9);
		tree1.add(16);
		tree1.add(5);
		tree1.add(3);
		tree1.add(7);
		tree1.add(2);
		tree1.add(19);
		tree1.add(12);
		tree1.add(99);
		tree1.add(26);
		tree1.add(39);
		tree1.add(10);
		tree1.add(95);
		System.out.println("Printing First Tree --> ");
		tree1.inOrder();
		
		System.out.println();
		System.out.println();
		System.out.println(tree1.getLCA(95,99));
				
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
		
		public int getLCA(int n1, int n2) {
			return LCA(root, n1, n2);
		}
		
		private int LCA(Node current, int n1, int n2) {
			if(current == null) {
				return 0;
			}
			
			if(n1 < current.value && n2 < current.value) {
				return LCA(current.left, n1, n2);
			}
			else if(n1 > current.value && n2 > current.value) {
				return LCA(current.right, n1, n2);
			}
			else {
				return current.value;
			}		
		}
		
		
	}
	
	

}
