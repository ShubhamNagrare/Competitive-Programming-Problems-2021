package Array;

public class Find_Min_Distance_Between_Two_Elements {
	
	
	public void solve()
	{
		int arr[] = {3,5,4,2,6,3,0,0,5,4,8,3};
		int x = 3;
		int y=4;
		int n = arr.length;
		
		System.out.println("Min Distance  : " + minDistance(arr, n, x, y));
	}

	
	private int minDistance(int[] a, int n, int x, int y) {
		
		int prev = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		int i=0;
		
		for(i =0; i<n; i++) {
			
			if(a[i] == x || a[i] == y) {
				prev = i;
				break;
			}
		}
		
		
		for( ; i<n; i++) {
			
			if(a[i] == x || a[i] == y) {
				
				
				if(a[prev] != a[i]  && (i- prev) < min) {
					
					min = i-prev;
					prev = i;
				}
				else {
					prev = i;
				}		
			}
		}
		return min;
	}

}
