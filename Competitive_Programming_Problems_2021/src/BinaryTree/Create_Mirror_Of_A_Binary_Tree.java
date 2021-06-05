package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class Create_Mirror_Of_A_Binary_Tree {

	
	public void solve() {
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
		System.out.print("inorder : ");
		bt.inOrder();
		
		bt.mirror();
		System.out.print("inorder : ");
		bt.inOrder();
		

	}
	
	private void inOrderr(Node curr) {
		if(curr != null) {
			inOrderr(curr.left);
			System.out.print(curr.data + " ");
			inOrderr(curr.right);
		}
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
		
		public List<Integer> mirror() {
			return mirror(root);
		}
		
		private List<Integer> mirror(Node curr) {

			List<Integer> list = new ArrayList<>();
			if(root == null)
				return list;
			
			Queue<Node> q = new LinkedList<>();
			q.add(curr);
			
			while(!q.isEmpty()) {
				
				Node c = q.poll();
				
				Node temp = c.left;
				c.left = c.right;
				c.right = temp;
				
				
				if(c.left != null) {
					q.add(c.left);
				}
				if(c.right != null) {
					q.add(c.right);
				}
	
			}			
			return list;
		}
		
		
		public void inOrder() {
			inOrder(root);
		}
		
		private void inOrder(Node curr) {
			if(curr != null) {

				System.out.print(curr.data + " ");
				inOrder(curr.left);
				inOrder(curr.right);
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

