package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZag_Traversal_Of_A_Binary_Tree {


	
	public void solve() {
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
		System.out.print("inorder : ");
		bt.inOrder();
		

		System.out.print("ZigZag : ");
		bt.zigZagTraversal();
		//bt.inOrder();
	}
	

	
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
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
		
		public void zigZagTraversal() {
			zigZagTraversal(root, 0);
		}
		
		private void zigZagTraversal(Node curr, int i) {
			
			Queue<Node> q = new LinkedList<>();
			q.add(curr);
			
			while(!q.isEmpty()) {
				
				Node node = q.poll();
				System.out.print(" " + node.data);
				
				//if(i%2 == 0) {
				if(node.left != null) {
					q.add(node.left, i++);
				}
				if(node.right != null) {
					q.add(node.right, i++);
				}
//				}
//				else {
//					if(node.right != null) {
//						q.add(node.right);
//					}
//					if(node.left != null) {
//						q.add(node.left);
//					}
//
//				}
//				i++;
			}
			
			
		}
		
		
		
		
		
		
		public void inOrder() {
			preOrder(root);
		}
		
		private void preOrder(Node curr) {
			if(curr != null) {

				System.out.print(curr.data + " ");
				preOrder(curr.left);
				preOrder(curr.right);
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
						Pair lp = new Pair(top.node.left,1);
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
						Pair lp = new Pair(top.node.right,1);
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


