package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;


public class Merge_Two_BBST_Return_A_In_Ordered_List {
	
public void implement() {
		
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
		
		System.out.println();
		System.out.println();
		System.out.println("Merging...");
		merge(tree1, tree2);
	}


	public void merge(BinarySearchTree t1, BinarySearchTree t2) {
		
		System.out.println();
		System.out.println("In Order of T1 ");
		List<Integer> li1 = t1.getInOrderList();
		t1.inOrder();
		
		System.out.println();
		System.out.println("In Order of T2 ");
		List<Integer> li2 = t2.getInOrderList();
		t2.inOrder();
		
		List<Integer> ans = new ArrayList<>();
		int first =0;
		int second = 0;
		int total = li1.size() + li2.size();
			
			while(first < li1.size() && second < li2.size()) {
				
				int f = li1.get(first);
				int s = li2.get(second);
				
				if( f < s) {
					ans.add(li1.get(first));
					first ++;
				}
				else if(f > s){
					ans.add(li2.get(second));
					second ++;
				}			
			}
			
			while(first < li1.size()) {
				ans.add(li1.get(first));
				first ++;
			}
			
			while(second < li2.size()) {
				ans.add(li2.get(second));
				second ++;
			}

		
		
			System.out.println();
			System.out.println();
			System.out.println("FINAL ANSWER");
		for(int k=0; k<ans.size(); k++ ) {

			System.out.print(" " + ans.get(k));	
		}
		
		
		
	}
	
	
	

	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left=right=null;
		}
	}
	
	class BinarySearchTree{
		Node root;
		List<Integer> inOrderList;
		
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
			inOrder(root);
		}
		
		private void inOrder(Node current) {
			if(current != null) {
				inOrder(current.left);
				System.out.print(" " + current.value);
				inOrder(current.right);
			}
		}
		
		
		public List<Integer> getInOrderList() {
			inOrderList = new ArrayList<>();
			getInOrderList(root);
			return inOrderList;
		}
		
		private void getInOrderList(Node current) {
			if(current != null) {
				getInOrderList(current.left);
				inOrderList.add(current.value);
				getInOrderList(current.right);
			}		
		}
		
		
		
	}
	
}
