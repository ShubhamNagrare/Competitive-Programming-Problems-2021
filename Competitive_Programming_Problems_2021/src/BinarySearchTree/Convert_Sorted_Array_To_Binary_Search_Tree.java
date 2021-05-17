package BinarySearchTree;

public class Convert_Sorted_Array_To_Binary_Search_Tree {
	
	
	// TODO
	public void implement() {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("BST Search");
		bst.construct(arr);
		bst.preOrder();
	}
	

	

	
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left =right=null;
		}
		
		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
	
	class BinarySearchTree{
		Node root;
		
		public Node getRoot() {
			return root;
		}
		
		public void add(int value) {
			root = addRecurssive(root,value);
		}
		
		private Node addRecurssive(Node current, int value) {
			System.out.println("here");
			if(current == null) {
				return new Node(value);
			}		
			if(value < current.value) {
				current.left = addRecurssive(current.left, value);
			}
			else if(value > current.value) {
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
		
		public void preOrder() {
			traversePreOrder(root);
		}
		
		private void traversePreOrder(Node current) {
			if(current != null) {
				System.out.print(" " + current.value);
				traversePreOrder(current.left);
				traversePreOrder(current.right);
			}

		}
		
		
		
		
		public void inOrderUtil(Node root) {
			if(root != null) {
				inOrderUtil(root.left);
				System.out.print(" " + root.value);
				inOrderUtil(root.right);
			}
		}
		
		public void construct(int[] arr) {
			root = construct(arr, 0, arr.length-1);
		}
		
		private Node construct(int[] arr, int start, int end) {
			
			if(start > end) {
				return null;
			}
			
			int mid = (start + end)/2;
			
			Node ln = construct(arr, start, mid -1);
			Node rn = construct(arr,  mid+1, end);			
			Node node = new Node(arr[mid], ln, rn);
			
			return node;
		}
		
		
	}

}
