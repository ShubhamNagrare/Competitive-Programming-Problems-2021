package BinarySearchTree;


public class Create_Max_Min_Size_Sum_Find_Functions_In_A_BST {
	
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
		System.out.println("Get Min--");
		System.out.println(tree1.getMin());
		
		System.out.println();
		System.out.println("Get Max--");
		System.out.println(tree1.getMax());
		
		System.out.println();
		System.out.println("Get Size--");
		System.out.println(tree1.getSize());
		
		System.out.println();
		System.out.println("Get Sum--");
		System.out.println(tree1.getSum());
		
		System.out.println();
		System.out.println("Get Find--");
		System.out.println(tree1.find(12));
				
	}
	
	
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left = right=null;
		}
	}
	
	class BST{
		Node root;
		int sum;
		
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
		
		public int getMax() {
			return getMax(root);
		}
		
		private int getMax(Node current) {
			if(current.right != null) {
				return getMax(current.right);
			}
			
				return current.value;
		}
		
		public int getMin() {
			return getMin(root);
		}
		
		private int getMin(Node current) {
			if(current.left != null) {
				return getMin(current.left);
			}else {
				return current.value;
			}
			
		}
		
		
		public int getSize() {
			return getSize(root);
		}
		
		private int getSize(Node current) {
			if(current == null){
				return 0;
			}
			int lv = getSize(current.left);
			int rv = getSize(current.right);
			int sum = lv + rv + 1;
			return sum;
		}
		
		
		public int getSum() {
			sum = 0;
			sum(root);
			return sum;
		}
		
		private void sum(Node current) {
			if(current != null) {
				sum(current.left);
				sum += current.value;
				sum(current.right);
			}
		}
		
		public boolean find(int value) {
			return find(root, value);
		}
		
		private boolean find(Node current, int value) {
			if(current == null) {
				return false;
			}
		//	if(current.value == value) {
		//		return true;
		//	}
			if(value < current.value ) {
				return find(current.left, value);	
			}
			else if(value > current.value) {
				return find(current.right, value);
			}else {
				return true;
			}
		}
		
		
		
		
		
		
	}

}
