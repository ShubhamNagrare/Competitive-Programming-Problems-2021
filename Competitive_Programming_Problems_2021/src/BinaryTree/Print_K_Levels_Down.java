package BinaryTree;

import java.util.Stack;

import BinaryTree.Node_To_Root_Path_In_A_Binary_Tree.BinaryTree;

public class Print_K_Levels_Down {
	
	public void solve() {
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
		bt.printKLevel(0);
	}
	
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
		}
	}
	
	class Pair{
		int val;
		Node node;
		Pair(Node node, int val){
			this.val=val;
			this.node=node;
		}
	}

	
	class BinaryTree{
		Node root;
		
		public void printKLevel(int k) {
			printKLevel(root, k, 0);
		}
		
		private void printKLevel(Node curr, int k, int currLevel) {
			if(curr != null) {
				
				if(currLevel == k) {
					System.out.println("" + curr.data);
				}
			printKLevel(curr.left, k, currLevel+1);
			printKLevel(curr.right, k, currLevel+1);
			}
		}
		
		
		
		public void insert(int[] arr) {
			
			root = new Node(arr[0]);
			Pair p = new Pair(root, 1);
			
			Stack<Pair> stack = new Stack<>();
			stack.add(p);
			
			int i=0;
			while(stack.size() > 0) {
				
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
						Pair rp = new Pair(top.node.right, 1);
						stack.add(rp);
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
