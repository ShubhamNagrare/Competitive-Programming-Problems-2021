package BinaryTree;

import java.util.Stack;

public class Find_Height_Of_A_Binary_Tree {

	public void solve() {
		
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.create(arr);
		bt.findHeight();
		
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
			this.val=val;
			this.node=node;
		}
	}
	
	
	class BinaryTree{
		Node root;
		
		public void create(int[] data) {
			
			root = new Node(data[0]);
			Pair cp = new Pair(root, 1);
				
			Stack<Pair> stack = new Stack<>();
			stack.push(cp);
			
			int i = 0;
			while(stack.size() > 0) {
				
				Pair top = stack.peek();
				
				if(top.val == 1){				
					i++;
					if(data[i] != -1){
						top.node.left = new Node(data[i]);
						Pair ppp = new Pair(top.node.left, 1);
						stack.push(ppp);
					}
					else {
						top.node.left = null;
					}					
					top.val = top.val+1;
				}				
				else if(top.val == 2){		
					i++;
					if(data[i] != -1) {
						top.node.right = new Node(data[i]);
						Pair ppp = new Pair(top.node.right, 1);
						stack.push(ppp);
					}
					else {
						top.node.right = null;
					}				
					top.val++;
				}			
				else{
					stack.pop();
				}	
			}	
			
		}
		
		public void findHeight() {
			System.out.println(height(root));
		}
		
		private int height(Node curr) {
			
			if(curr == null) {
				return 0;
			}
			else {
			int lh = height(curr.left);
			int rh = height(curr.right);
			
			return Integer.max(lh, rh) + 1;
			}
		}
		
		
	}
	
	
	
}



