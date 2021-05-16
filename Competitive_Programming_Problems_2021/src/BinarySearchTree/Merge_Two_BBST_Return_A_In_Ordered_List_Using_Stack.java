package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Merge_Two_BBST_Return_A_In_Ordered_List_Using_Stack {
	
	public void solve() {
		
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.add(9);
		tree1.add(16);
		tree1.add(5);
		tree1.add(3);
		tree1.add(7);
		tree1.add(2);
		tree1.add(19);
		tree1.add(12);
		tree1.add(99);
		System.out.println("Printing First Tree --> ");
		tree1.inOrder();
		
		
		System.out.println();
		System.out.println();
		BinarySearchTree tree2 = new BinarySearchTree();
		tree2.add(50);
		tree2.add(8);
		tree2.add(1);
		tree2.add(10);
		tree2.add(18);
		tree2.add(24);
		tree2.add(39);
		tree2.add(42);
		tree2.add(4);
		System.out.println("Printing Second Tree --> ");
		tree2.inOrder();	
		
		List<Integer> l1 = tree1.inOrderList();
		List<Integer> l2 = tree2.inOrderList();
		
		mergeAndPrint(l1, l2);			
	}
	
	private void mergeAndPrint(BinarySearchTree t1 ,  BinarySearchTree t2) {
		
		List<Integer> ans = new ArrayList<>();
		
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		Node curr1 = t1.getRoot();
		Node curr2 = t2.getRoot();
		while() {
			
			
			int min1 = getMinimum(curr1);
			int min2 = getMinimum(curr2);
			
			s1.add(min1);
			s2.add(min2);
			
			
			
		}
		

				
	}
	
	public int getMinimum(Node current) {
		return current.left == null ? current.value : getMinimum(current.left);
	}
	
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left = right = null;
		}
	}
	
	class BinarySearchTree{
		Node root;
		List<Integer> inorder;
		
		public Node getRoot() {
			return root;
		}
		
		public void add(int value) {
			root = addRecurssive(root, value);
		}
		
		private Node addRecurssive(Node current, int value) {
			if(current == null) {
				return new Node(value);
			}
			
			if(value < current.value) {
				current.left = addRecurssive(current.left, value);
			}
			else if(value > current.value){
				current.right = addRecurssive(current.right, value);
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
		
		
		public List<Integer> inOrderList() {
			inorder = new ArrayList<>();
			getInOrderList(root);
			return inorder;
		}
		
		
		private void getInOrderList(Node current) {
			if(current != null) {
				getInOrderList(current.left);
				inorder.add(current.value);
				getInOrderList(current.right);
			}
			
		}
		
	}
	

}
