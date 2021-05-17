package BinarySearchTree;


public class Find_Kth_Smallest_Element_In_A_BST {
	
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
		System.out.println("Printing First Tree --> ");
		tree1.inOrder();
		
		System.out.println();
		System.out.println();
		int k = 6;
		System.out.println(tree1.getKthSmallest(k));
				
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
		int kthSmallest;
		int key;
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		private Node addRecursive(Node current, int value){
			if(current == null) {
				return new Node(value);
			}
			
			if(value < current.value) {
				current.left = addRecursive(current.left, value);
			}
			else {
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
		
		public int getKthSmallest(int key) {
			kthSmallest = -1;
			this.key = key;
			kthSmallest(root);
			System.out.println();
			return kthSmallest;
		}

		
		private void kthSmallest(Node current) {
			if(current != null) {
			
			if(key <= 0) {
				return;
			}
			
			kthSmallest(current.left);
			key--;
			if(key == 0) {
				kthSmallest = current.value;
				return;
			}	
			
			kthSmallest(current.right);
			}
		}
		
	}

}
