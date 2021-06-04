package BinaryTree;

import java.util.Stack;


public class Print_Single_Child_Node {
	
	public void solve() {
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
		bt.printSingleLeftNode();
	}
	
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	class Pair{
		int val;
		Node node;
		public Pair(Node node, int val) {
			this.node=node;
			this.val=val;
		}
	}
	
	class BinaryTree{
		Node root;
		
		public void printSingleLeftNode() {
			printSingleLeftNode(root);
		}
		
		private void printSingleLeftNode(Node curr) {
			
			if(curr == null) {
				return;
			}
			
			if(curr.left == null && curr.right != null) {
				System.out.println(" " + curr.data);
			}			
			else if(curr.right == null && curr.left != null) {
				System.out.println(" " + curr.data);
			}
			
			printSingleLeftNode(curr.left);
			printSingleLeftNode(curr.right);
			
		}
		
		
		
		public void insert(int[] arr) {
			
			root = new Node(arr[0]);
			Pair p = new Pair(root, 1);
			
			Stack<Pair> stack = new Stack<>();
			stack.add(p);
			
			int i=0;
			while(!stack.isEmpty()) {
				
				Pair top = stack.peek();
				
				if(top.val == 1) {
					
					i++;
					if(arr[i] != -1) {
						top.node.left = new Node(arr[i]);
						Pair lp = new Pair(top.node.left, 1);
						stack.add(lp);
					}
					else {
						top.node.left = null;
					}
					top.val++;
					
				}
				else if(top.val == 2) {
					i++;
					if(arr[i] != -1) {
						top.node.right = new Node(arr[i]);
						Pair lp = new Pair(top.node.right, 1);
						stack.add(lp);
					}
					else {
						top.node.right = null;
					}
					top.val++;
				}
				else {
					stack.pop();
				}			
			}
			
		}
	}

}
