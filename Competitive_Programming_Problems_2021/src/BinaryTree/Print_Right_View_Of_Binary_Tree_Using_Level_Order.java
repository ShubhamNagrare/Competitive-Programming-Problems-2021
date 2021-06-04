package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Print_Right_View_Of_Binary_Tree_Using_Level_Order {

	public void solve() {
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
		bt.printRightView();
		
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
			this.val = val;
			this.node = node;
		}
	}
	
	class BinaryTree{
		Node root;
		
		public void printRightView() {
			printRightView(root);
		}
		
		private void printRightView(Node curr) {
			
			Queue<Node> queue = new LinkedList<>();
			queue.add(curr);
			
			while(!queue.isEmpty()) {
				
				int n = queue.size();
							
				for(int i=1; i<=n; i++) {
					Node node = queue.poll();

					if(i == n) {
						System.out.print(" " + node.data);					
					}
					

					if(node.left != null) {
						queue.add(node.left);
					}
					if(node.right != null) {
						queue.add(node.right);
					}
					
				}
				
			}
			
		}
		
		
		
		public void insert(int[] arr) {
			root = new Node(arr[0]);
			Pair p = new Pair(root, 1);
			
			Stack<Pair> stack = new Stack<>();
			stack.push(p);
			
			int i=0;
			while(!stack.isEmpty()) {
				
				Pair top = stack.peek();
				
				if(top.val == 1) {
					
					i++;
					if(arr[i] != -1) {
						top.node.left = new Node(arr[i]);
						Pair lp = new Pair(top.node.left, 1);
						stack.push(lp);
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
						stack.push(lp);
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
