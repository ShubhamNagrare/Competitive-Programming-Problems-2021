package BinarySearchTree;

public class Convert_Sorted_Array_To_Binary_Search_Tree {
	
	
	// TODO
	public void implement() {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		BinarySearchTree bst = new BinarySearchTree();
		construct(bst, arr, 0, arr.length);
		
		bst.inOrder();
		
		
	}
	
	public void construct(BinarySearchTree bst, int[] arr, int start, int end) {
				
		if(start >= end) {
			bst.add(arr[start]);
			return;
		}
		
			int mid = (start + ((end) - start))/2;
			
			bst.add(arr[mid]);
			
			construct(bst, arr, start, mid);
			
			construct(bst, arr, mid+1, end);

	}
	
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left =right=null;
		}
	}
	
	class BinarySearchTree{
		Node root;
		
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
			traverseInOrder(current.left);
			System.out.println(" " + current.value);
			traverseInOrder(current.right);
		}
		
		
	}

}
