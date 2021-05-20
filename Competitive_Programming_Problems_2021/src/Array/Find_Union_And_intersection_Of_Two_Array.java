package Array;

public class Find_Union_And_intersection_Of_Two_Array {
	
	public void solve() {
		
		int arr1[] = {1,3,4,6,9};
		int arr2[] = {1,2,4,7,8,9};
		
		int m = arr1.length;
		int n = arr2.length;	
		
		printUnion(arr1, arr2, m,n);
		
		System.out.println();
		printIntersection(arr1,arr2,m,n);
	}
	
	
	public void printIntersection(int[] a, int[] b, int m, int n) {		
		int i =0,j=0;
		while(i < m && j <n) {
			
			if(a[i] < b[j]) {
				//System.out.print(" " + a[i++]);
				i++;
			}
			else if(a[i] > b[j]) {
				//System.out.print(" " + b[j++]);
				j++;
			}
			else {
				System.out.print(" " + a[i]); i++; j++;
			}
		}
	}
	
	
	
	public void printUnion(int[] a, int[] b, int m, int n) {
		
		int i =0,j=0;
		while(i < m && j <n) {
			
			if(a[i] < b[j]) {
				System.out.print(" " + a[i++]);
			}
			else if(a[i] > b[j]) {
				System.out.print(" " + b[j++]);
			}
			else {
				System.out.print(" " + a[i]); i++; j++;
			}
		}
		
		while(i<m) {
			System.out.print(" " + a[i]); i++;
		}
		
		while(j<n) {
			System.out.print(" " + b[j]); j++;
		}	
	}

}
