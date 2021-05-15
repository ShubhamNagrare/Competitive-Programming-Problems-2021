package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traverse_Binary_Tree_Using_Level_Order_Traversal {
	
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
		
		tree.traverseLevelOrder();
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
		
		private Node addRecursive(Node current, int value){
			
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
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		
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
		
		
		
	}

}
