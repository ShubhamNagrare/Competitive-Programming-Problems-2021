package BinaryTree;

import java.util.Stack;

import BinaryTree.Iterative_InOrder_PreOrder_PostOrder_Traversal.BinaryTree;

public class Node_To_Root_Path_In_A_Binary_Tree {
	
	public void solve() {
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
	}
	
	
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
			left=right=null;
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
		
		public void insert(int[] arr) {
			
			root = new Node(arr[0]);
			Pair fp = new Pair(root, 1);
			
			Stack<Pair> stack = new Stack<>();
			stack.push(fp);
			
			int i=0;
			while(stack.size()>0) {
				
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
