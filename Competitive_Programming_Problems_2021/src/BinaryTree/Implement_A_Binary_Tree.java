package BinaryTree;

public class Implement_A_Binary_Tree {

}



class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}

class BinaryTree{
	
	Node root;
	
	private Node addEdge(Node root, int value) {
		if(root == null) {
			return new Node(value);
		}
		
		if(root.left == null) {
			root.left = addEdge(root.left, value);
		}
		else if(root.right == null) {
			root.right = addEdge(root.right, value);
		}
		return addEdge(root.left);
	}
	
	
	
	
	
	
}