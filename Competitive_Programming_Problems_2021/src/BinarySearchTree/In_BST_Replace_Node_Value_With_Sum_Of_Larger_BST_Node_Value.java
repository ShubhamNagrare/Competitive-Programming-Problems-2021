package BinarySearchTree;


public class In_BST_Replace_Node_Value_With_Sum_Of_Larger_BST_Node_Value {
	
	// https://www.geeksforgeeks.org/transform-bst-sum-tree/#:~:text=The%20idea%20is%20to%20traverse,key%20of%20the%20current%20node.
public void solve() {
		
		BST tree1 = new BST();
		tree1.add(11);
		tree1.add(2);
		tree1.add(29);
		tree1.add(1);
		tree1.add(7);
		tree1.add(15);
		tree1.add(40);
		tree1.add(35);
		System.out.println("Printing First Tree --> ");
		tree1.inOrder();
		
		tree1.replace();
		System.out.println();
		System.out.println("After Replacing with Max Sum --> ");
		tree1.inOrder();
				
	}
	
	
	
	
	class Node{
		int value;
		Node left,right;
		public Node(int value) {
			this.value = value;
			left=right=null;
		}
	}
	
	class BST{
		Node root;
		int sum;
		
		public void add(int value) {
			root = addRecursive(root, value);
		}
		
		private Node addRecursive(Node current, int value) {
			if(current == null) {
				return new Node(value);
			}
			
			if(value < current.value) {
				current.left = addRecursive(current.left, value);
			}
			else if(value > current.value) {
				current.right = addRecursive(current.right, value);
			}
			return current;		
		}
		
		public void replace() {
			sum = 0;
			replaceWithSumOfLarger(root);
		}
		
		private void replaceWithSumOfLarger(Node current) {
			if(current != null) {
				replaceWithSumOfLarger(current.right);
				int temp = current.value;
				current.value = sum;
				sum += temp;
				replaceWithSumOfLarger(current.left);
			}
		}
		
		public void inOrder() {
			traverseInOrder(root);
		}
		
		private void traverseInOrder(Node current) {
			if(current != null) {
				traverseInOrder(current.left);
				System.out.print(" " + current.value);
				traverseInOrder(current.right);
			}
		}
		
		
		
	}

}
