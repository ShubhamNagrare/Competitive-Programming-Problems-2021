package BinaryTree;

public class Implement_A_Binary_Search_Tree {
	
	
	public void createBinarySearchTree() {
		
		BinarySearchTree b = new BinarySearchTree();
		b.insert(50);
		b.insert(2);
		b.insert(68);
		b.insert(4);
		b.insert(99);
		
		b.print();
		
		
	}
	
	
	
	
	class BinarySearchTree{
		
		class Node{
			int key;
			Node left,right;
			
			public Node(int item) {
				key = item;
				left=right=null;
			}
		}
		
		Node root;
		
		public BinarySearchTree() {
			root = null;
		}
		
		
		void insert(int key) {
			root = insertRec(root, key);
		}
		
		
		
		
		Node insertRec(Node root, int key) {
					
			if(root == null) {
				root = new Node( key);
				return root;
			}
			
			if(key < root.key) {
				root.left = insertRec(root.left, key);
			}
			else if(key > root.key) {
				root.right = insertRec(root.right, key);
			}
					
			return root;
		}
		
		void print() {
			inOrderPrintRec(root);
		}
		
		void inOrderPrintRec(Node root) {
			
			if(root != null) {
				inOrderPrintRec(root.left);
				System.out.println(root.key);
				inOrderPrintRec(root.right);
			}
		}
		
		
	}
	
	

}
