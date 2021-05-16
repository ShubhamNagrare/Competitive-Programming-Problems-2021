package BinarySearchTree;
import java.util.LinkedList;
import java.util.Queue;


public class Implement_A_Binary_Tree {
	
	
	class Node{
		int value;
		Node left;
		Node right;
		
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
		
		
		private boolean containsNodeRecurcsive(Node current, int value) {
			
			if(current == null) {
				return false;
			}
			
			if(value == current.value) {
				return true;
			}
			
			return value < current.value ? containsNodeRecurcsive(current.left, value) : containsNodeRecurcsive(current.right, value);
			
		}
		
		private void traverseInOrder(Node node) {
			if(node != null) {
				traverseInOrder(node.left);
				System.out.print(" " + node.value);
				traverseInOrder(node.right);			
			}
		}
		
		private void traversePreOrder(Node node) {
			if(node != null) {
				System.out.print(" " + node.value);
				traversePreOrder(node.left);
				traversePreOrder(node.right);
			}
		}
		
		private void traversePostOrder(Node node) {
			if(node != null) {
				traversePostOrder(node.left);
				traversePostOrder(node.right);
				System.out.print(" " + node.value);
			}
		}
		
		
		private Node deleteRecursive(Node current, int value) {
			
			if(current == null) {
				return null;
			}
			
			if(value == current.value) {
				
				if(current.left == null && current.right == null) {
					return null;
				}
				if(current.left == null) {
					return current.right;
				}
				if(current.right == null) {
					return current.left;
				}
				
				int smallestValue = findSmallestValue(current.right);
				current.value = smallestValue;
				current.right = deleteRecursive(current.right, smallestValue);//
				return current;
				
			}
			
			if(value < current.value) {
				current.left =  deleteRecursive(current.left, value);
			}
			current.right = deleteRecursive(current.right, value);
			return current;
		}
		
		public void delete(int value) {
			root = deleteRecursive(root, value);
		}
		
		
		private int findSmallestValue(Node root) {
			return root.left == null ? root.value : findSmallestValue(root.left);
		}
		
		
		// DFS
		public void traverseLevelOrder() {
			
			if(root == null) {
				return;
			}
			
			Queue<Node> nodes = new LinkedList<>();			
			nodes.add(root);
			
			while(!nodes.isEmpty()) {
				
				Node node = nodes.remove();
				System.out.print(" " + node.value);
				
				if(node.left != null) {
					nodes.add(node.left);
				}
				
				if(node.right != null) {
					nodes.add(node.right);
				}			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		public void inOrder() {
			traverseInOrder(root);
		}
		
		public void preOrder() {
			traversePreOrder(root);
		}
		
		public void postOrder() {
			traversePostOrder(root);
		}
		
		public boolean containsNode(int value) {
			return containsNodeRecurcsive(root, value);
		}
		
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
	}
	
	
	public void implement() {
		
		BinaryTree tree = new BinaryTree();
		tree.add(6);
		tree.add(4);
		tree.add(8);
		tree.add(3);
		tree.add(5);
		tree.add(7);
		tree.add(9);
		
           System.out.println("PreOrder Traversal ->");
		   tree.preOrder();
		   System.out.println();
		   System.out.println("InOrder Traversal ->");
		   tree.inOrder();
		   System.out.println();
		   System.out.println("PostOrder Traversal ->");
		   tree.postOrder();
		   
		   System.out.println();
		   System.out.println();
		   System.out.println("Deleting Node 8 ->");
		   tree.delete(8);
		   System.out.println();
		   System.out.println("PreOrder Traversal ->");
		   tree.preOrder();
		   
		   System.out.println();
		   System.out.println("Level Order Traversal ->");
		   tree.traverseLevelOrder();
		
	}
	
		
	
}
