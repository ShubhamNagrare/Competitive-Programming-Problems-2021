package BinarySearchTree;

import BinarySearchTree.Traverse_Binary_Tree_Using_Pre_Order_Traversal.Node;

public class Traverse_Binary_Tree_Using_Post_Order_Traversal {
	
public void implement() {
		
		BinaryTree tree = new BinaryTree();
		tree.add(9);
		tree.add(16);
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(2);
		tree.add(19);
		tree.add(12);
		
		tree.postOrder();
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
			else {
				return current;
			}
			return current;
		}
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		
		private void traversePostOrder(Node current) {
			
			if(current != null) {
				traversePostOrder(current.left);
				traversePostOrder(current.right);
				System.out.print(" "  + current.value);
			}
			
		}
		
		public void postOrder() {
			traversePostOrder(root);
		}
		
	}

}
