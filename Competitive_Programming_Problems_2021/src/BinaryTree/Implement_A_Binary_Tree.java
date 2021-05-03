package BinaryTree;

public class Implement_A_Binary_Tree {
	
	
	public void implement() {
		
		BinaryTree tree = new BinaryTree();
		 tree.insert( 100);
		   tree.insert( 91);
           tree.insert( 85);
           tree.insert( 78);
           tree.insert( 66);
           tree.insert( 57);
           tree.insert( 43);
           tree.insert( 39);
		
		tree.print();
		
	}
	
	
	
	class BinaryTree{		
		class Node{
			int data;
			Node left,right;
			
			public Node(int data) {
				this.data = data;
				left = right=null;
			}
		}	
		
		
		Node root;
		
		public BinaryTree() {
			root = null;
		}
		
		public BinaryTree(int data) {
			this.root = new Node(data);
		}
		
		public void insert(int data) {
			if(root == null) {root = new Node(data);}
			insertRec(root, data);
		}
		
		
		
		
		public void insertRec(Node root, int data) {
			
			if(data < root.data) {			
				if(root.left != null) {
					insertRec(root.left, data);
				}
				else {
					System.out.println("Inserted data at --> " + data + " to left of : " +  root.data);
					root.left = new Node(data);
				}
			}
			else if(data > root.data){
				if(root.right != null) {
					insertRec(root.right, data);
				}
				else {
					System.out.println("Inserted data at --> " + data + " to right of : " +  root.data);
					root.right = new Node(data);		
				}
			}
		}
		
		
		public void print() {
			printTree(root);
		}
		
		public void printTree(Node root) {
			if(root != null) {
				printTree(root.left);
				System.out.println(root.data);
				printTree(root.right);
			}
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
}
