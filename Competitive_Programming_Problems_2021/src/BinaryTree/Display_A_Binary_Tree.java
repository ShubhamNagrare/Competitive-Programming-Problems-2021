package BinaryTree;

import java.util.Stack;

public class Display_A_Binary_Tree {
	
	public void solve() {
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
		bt.display();
		
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
			this.node = node;
			this.val = val;
		}
	}
	
	class BinaryTree{
		Node root;
		
		public void display() {
			display(root);
		}
		
		private void display(Node curr) {
			if(curr!= null) {
				String s = "";
				s += curr.left != null ? curr.left.data + " ": "<- ";
				s += curr.data + " ";
				s += curr.right != null ? curr.right.data + " ": "->";
				System.out.println(s);
							
				display(curr.left);
				display(curr.right);				
			}
		}
		
		
		
		public void insert(int[] arr) {
			
			root = new Node(arr[0]);
			Pair p = new Pair(root, 1);
			
			Stack<Pair> stack = new Stack<>();
			stack.add(p);
			
			int i = 0;
			while(stack.size() > 0) {
				
				Pair curr = stack.peek();
				
				if(curr.val == 1) {
					i++;
					if(arr[i] != -1) {
						curr.node.left = new Node(arr[i]);
						Pair lp = new Pair(curr.node.left, 1);
						stack.push(lp);
					}
					else {
						curr.node.left = null;
					}			
					curr.val++;
				}
				else if(curr.val == 2) {
					i++;
					if(arr[i] != -1) {
						curr.node.right = new Node(arr[i]);
						Pair lp = new Pair(curr.node.right, 1);
						stack.push(lp);
					}
					else {
						curr.node.right = null;
					}			
					curr.val++;
				}
				else {
					stack.pop();
				}
			}	
		}
		
		
		
	}

}
