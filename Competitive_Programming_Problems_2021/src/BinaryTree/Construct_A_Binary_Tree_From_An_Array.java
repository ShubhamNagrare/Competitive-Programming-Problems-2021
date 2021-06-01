package BinaryTree;

import java.util.Stack;

public class Construct_A_Binary_Tree_From_An_Array {
	
	public void solve() {	
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
		bt.inOrder();
		//create(arr);
	}
	
	
	public static void create(int[] data) {
		
		Node root = new Node(data[0]);
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
		
		inOrder(root);
		
		
		
	}
	
	
	public static void inOrder(Node curr) {
		if(curr != null) {
			inOrder(curr.left);
			System.out.print(" " + curr.data);
			inOrder(curr.right);
		}
	}
	
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
	Node node;
	int val;
	public Pair(Node curr, int v) {
		this.node = curr;
		this.val = v;
	}
}

class BinaryTree{
	
	Node root;
		
	public void inOrder() {
		inOrder(root);
	}
	
	private void inOrder(Node curr) {
		if(curr != null) {
			inOrder(curr.left);
			System.out.print(" " + curr.data);
			inOrder(curr.right);
		}
	}
	
	
	public void insert(int[] data) {
		
			root = new Node(data[0]);
			Stack<Pair> stack = new Stack<>();
			
			Pair cp = new Pair(root, 1);
			stack.add(cp);
			
			int i = 0;
			while(stack.size() > 0) {
				
				Pair top = stack.peek();
				
				if(top.val == 1){					
					i++;
					if(data[i] != -1) {
						top.node.left = new Node(data[i]);
						Pair ppp = new Pair(top.node.left, 1);
						stack.add(ppp);
					}
					else {
						top.node.left = null;
					}					
					top.val++;
				}				
				else if(top.val == 2) {		
					i++;
					if(data[i] != -1) {
						top.node.right = new Node(data[i]);
						Pair ppp = new Pair(top.node.right, 1);
						stack.add(ppp);
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