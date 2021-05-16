package BinarySearchTree;
import java.util.*;

public class Convert_A_Binary_Tree_To_Binary_Search_Tree {
	
	static List<Integer> li;
	
	public void solve() {
		
		System.out.println("Constructing Initial Binary Tree..");
		BinaryTree btree = new BinaryTree();
		btree.root = new Node(10);
		btree.root.left = new Node(45);
		btree.root.left.right = new Node(81);
		btree.root.left.left = new Node(101);
		btree.root.right = new Node(19);
		btree.root.right.left = new Node(40);
		
		System.out.println();
		System.out.println("Printing Initial Binary Tree..");
		li = new ArrayList<Integer>();
		btree.traverseInOrder();
		
		
		System.out.println();
		System.out.println("Sorting Initial Binary Tree..");
		Collections.sort(li);
		for(int i=0; i< li.size(); i++) {
			System.out.println(li.get(i));
		}
			
		System.out.println();
		System.out.println("Printing New Binary Tree..");
		BinarySearchTree bst = new BinarySearchTree();
		bst.construct(li);
		bst.inOrder();
	
	}
	
	
	class BinarySearchTree{
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
				System.out.println(" " + current.value);
				traverseInOrder(current.left);
				//System.out.println(" " + current.value);
				traverseInOrder(current.right);
			}
		}
		
		
		public void construct(List<Integer> list) {
			
		int mid = (0 + ((li.size()-1) - 0)) / 2;
		add(li.get(mid));
		
		for(int i =0; i<li.size(); i++) {
			if(i!=mid) {
				add(li.get(i));
			}		
		}			
		}
		
		
		
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
		
		public BinaryTree() {
			root = null;
		}
		
		public void traverseInOrder() {
			inOrder(root);
		}
		
		public Node getRootNode() {
			return root;
		}
		
		private void inOrder(Node current) {
			if(current != null) {
				inOrder(current.left);
				System.out.println(" " + current.value);
				li.add( current.value);
				inOrder(current.right);
			}
		}
	}
	
	

}
