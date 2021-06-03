package BinaryTree;

import java.util.Stack;


public class Iterative_InOrder_PreOrder_PostOrder_Traversal {
	
	public void solve() {
		
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.create(arr);
		bt.inOrder();
		
		
		
	}
	
	
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
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
		
		
		String pre = "";
		String in = "";
		String post = "";
		
		public void inOrder() {
			inOrder(root);
		}
		
		
		private void inOrder(Node curr) {
			
			if(curr == null){ 
				return;
			}
			
			Pair p = new Pair(curr, 1);
			Stack<Pair> stack = new Stack<>();
			stack.add(p);
			
			
			while(stack.size() > 0) {
				
				Pair top = stack.peek();
				if(top.val == 1) {
					
					pre += top.node.data + " ";
					if(top.node.left != null) {
						Pair lp = new Pair(top.node.left, 1);
						stack.push(lp);
					}
					top.val++;
				}
				else if(top.val == 2) {
					in += top.node.data  + " ";
					if(top.node.right != null) {
						Pair rp = new Pair(top.node.right, 1);
						stack.add(rp);
					}	
					top.val++;
				}
				else {
					post += top.node.data  + " ";
					stack.pop();
				}			
			}
			
			System.out.println("PRE : " + pre);
			System.out.println("IN : " + in);
			System.out.println("POST : " + post);
			
		}
		
		
		
		
		public void create(int[] arr) {
			
			root = new Node(arr[0]);
			Pair p = new Pair(root, 1);
			
			Stack<Pair> stack = new Stack<Pair>();
			stack.push(p);
			
			int i=0;
			while(stack.size() > 0) {
				
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
