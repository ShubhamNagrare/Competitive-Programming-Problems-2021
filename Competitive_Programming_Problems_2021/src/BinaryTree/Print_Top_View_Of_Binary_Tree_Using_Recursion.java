package BinaryTree;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Print_Top_View_Of_Binary_Tree_Using_Recursion {


	public void solve() {
		int[] arr = {50, 25, 12, -1,  -1,  37, 30, -1, -1, -1, 75, 62, -1, 70, -1, -1, 87, -1, -1 };	
		BinaryTree bt = new BinaryTree();
		bt.insert(arr);
		bt.topView();
		
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
		int height;
		int[] arr;
		Map<Integer, Pair> map;
		
		public void topView() {
			map = new HashMap<>();
			Pair p = new Pair(root, 0);
			map.put(0, p);
			topView(root, 0, 0);
			
		}
		
		private void topView(Node curr, int dist, int height) {
			
			if(curr == null) {
				return;
			}
			
			if((!map.containsKey(dist)) || map.get(dist).val < height ) {
					map.put(dist, new Pair(curr, height));
			}
			
						
			topView(curr.left, dist-1, height+1);
			topView(curr.right, dist+1, height+1);
			
		}
		
		private int getHeight() {
			return getHeight(root);
		}
		
		private int getHeight(Node curr) {
			if(curr == null) {
				return 0;
			}
			
			int lh = getHeight(curr.left) + 1;
			int rh = getHeight(curr.right) + 1;
			return Integer.max(lh, rh);
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

