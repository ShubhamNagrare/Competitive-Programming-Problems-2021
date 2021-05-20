package Array;

public class Find_Majority_ELement_In_A_Array {
	
	public void solve() {
		
		int[] arr = {3,3,4,2,4,4,2,4,4};		// Anser = 4
		int n = arr.length;
		
		printMajorityElement(arr, n);
		
	}
	
	
	private boolean isMajority(int[] arr, int n, int max) {
		int count =0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == max) {
				count++;
			}
		}
		
		if(count > n/2) {
			return true;
		}
		return false;
	}
	
	
	private void printMajorityElement(int[] arr, int n) {
		
		int max = findMajorityCandidate(arr, n);
		
		if(isMajority(arr, n, max)) {
			System.out.println("Cnadidate : " + max);
		}
		else {
			System.out.println("Not Present");
		}
		
	}
	
	
	
	private int findMajorityCandidate(int[] arr, int n) {
		
		int max =0;
		int count =1;
		
		for(int i=1; i<n; i++) {
			
			if(arr[max] == arr[i]) {
				count++;	
			}
			else {
				count --;
			}
			
			if(count == 0) {
				max = i;
				count = 1;
			}			
		}
		return arr[max];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	class Node{
		int value;
		Node left,right;
		
		
		public Node(int value) {
			this.value = value;
			left = right=null;
		}
	}
	
	class BinarySearchTree{
		Node root;
		private int majorityElement;
		private int majorityOccurence;
		
		private int currentElement;
		private int currentCount;
		
		
		
		public int findMajorityElement() {
			majorityElement = root.value;
			majorityOccurence = 0;
			currentCount = 1;
			findMajorityElement(root);
			return majorityElement;
		}
		
		private void findMajorityElement(Node current) {
			if(current != null) {
				findMajorityElement(current.left);
				
				if(majorityElement == current.value) {
					currentCount ++;
					if(majorityElement == currentCount) {
						majorityElement++;
					}
					
				}
				
				
				findMajorityElement(current.right);
			}
		}
		
		
		
		
		
		
		
		
		public void add(int value) {
			root = addRecurssive(root, value);
		}
		
		private Node addRecurssive(Node current, int value) {
			
			if(current == null) {
				return new Node(value);
			}
			
			if(value <= current.value) {
				current.left = addRecurssive(current.left, value);
			}
			else if(value > current.value) {
				current.right = addRecurssive(current.right, value);
			}
			return current;
		}
		
		
	}

}
