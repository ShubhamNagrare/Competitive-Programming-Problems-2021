package Graph;

public class Count_No_Of_Islands_Using_Graph {
	
	 public void solve() {
		 
		int[][] arr 
		= { { 0, 0, 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 0 },
			{ 1, 1, 0, 0, 0, 1, 1, 0 },
			{ 1, 1, 1, 1, 0, 1, 1, 0 },
			{ 1, 1, 1, 1, 0, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 0 },
			{ 1, 1, 1, 1, 1, 1, 1, 0 }
		 };		
		
		findIslands(arr);
		
		//System.out.println(arr.length);
		
	 }
	 
	 private void findIslands(int i, int j, boolean[][] visited, int[][] arr ) {

		 if(i >= visited.length || j >= visited[0].length || i < 0 || j < 0 || visited[i][j] == true || arr[i][j] == 1) {
			 return;
		 }
		 
		 visited[i][j] = true;
		 
		 findIslands(i+1, j, visited, arr);
		 findIslands(i-1, j, visited, arr);
		 findIslands(i, j-1, visited, arr);
		 findIslands(i, j+1, visited, arr);
	 }
	 
	 
	 
	 
	 
	 public void findIslands(int[][] arr) {
		 boolean[][] visited = new boolean[arr.length][arr.length];
		 for(int i=0; i < arr.length; i++) {
			 for(int j=0; j < arr.length; j++) {
				 visited[i][j] = false;
			 }
		 }
		 
		 int count = 0;
		 for(int i=0; i < arr.length; i++) {
			 for(int j=0; j < arr[i].length; j++) {
				 if(!visited[i][j]  && arr[i][j] == 0) {
					 findIslands(i, j, visited, arr);
					 visited[i][j] = true;
					 count ++;
				 }
			 }
		 }
		 
		 System.out.println(count);
		 
	 }
	        
	      

}
