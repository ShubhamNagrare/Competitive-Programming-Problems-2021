package BinarySearchTree;

public class Find_And_Print_Target_Sum_In_A_BST_Using_Find_Method {
	
	
public void solve() {
	
	//https://www.geeksforgeeks.org/find-a-pair-with-given-sum-in-bst/
	// Not the Best Approach, as O(n^2) time is taken
		
		BST tree1 = new BST();
		tree1.add(15);
		tree1.add(10);
		tree1.add(20);
		tree1.add(8);
		tree1.add(12);
		tree1.add(16);
		tree1.add(25);
		System.out.println("Printing First Tree --> ");
		tree1.inOrder();
		
		System.out.println();
		System.out.println("After Replacing with Max Sum --> ");
		int sum = 30;
		
		System.out.println(tree1.getSumPair(sum));
				
	}
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left = right = null;
		}
	}
	
	
	public boolean findNodee(Node current, int value) {
		if(current == null) {
			return false;
		}
		
		if(value < current.value) {
			return findNodee(current.left, value);
		}
		else if(value > current.value) {
			return findNodee(current.right, value);
		}
		else {
			return true;
		}
		
	}
	
	
	
	
	class BST{
		Node root;
		int sumPairs;
		int totalSum;
		
		
		public int getSumPair(int value) {
			sumPairs = 0;
			totalSum = value;
			getSumPair(root);
			return sumPairs;
		}
		
		private void getSumPair(Node current) {
			if(current != null) {
				getSumPair(current.left);
				int otherVal = totalSum - current.value;
				boolean isExist = findNodee(current,otherVal);	
				if(isExist ) {
					sumPairs ++;
				}
				getSumPair(current.right);
			}
		}
		
		public boolean find(int value) {
			return findNode(root, value);
		}
		
		private boolean findNode(Node current, int value) {
			if(current == null) {
				return false;
			}
			
			if(value < current.value) {
				return findNode(current.left, value);
			}
			else if(value > current.value) {
				return findNode(current.right, value);
			}
			else {
				return true;
			}
			
		}
		
		
		
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
		
	
		
	}


}
