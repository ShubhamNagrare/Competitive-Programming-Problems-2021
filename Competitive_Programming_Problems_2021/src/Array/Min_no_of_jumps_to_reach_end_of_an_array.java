package Array;

public class Min_no_of_jumps_to_reach_end_of_an_array {

	
	// Question ref : https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
	
	 public static void minJumps(int[] arr){
        int sum = 0;
       System.out.println( gmin(arr));
    }
                                           //11      2            //  3        9              12
	 static int gmin(int[] arr){
	       
	       int n = arr.length;
	       int jumps =0;            
	       int lastInd = arr[0];  
	       
	       if(lastInd == 0){
	           return -1;
	       }
	       
	       //  2 3  1  1  2 4 2 0   1 1
	       for(int i=1; i<n; i++){
	           
	           if(arr[i]==0){
	               return jumps--; 
	               //break; 
	            }  
	           if(lastInd == i){
	               jumps ++;             //4
	               lastInd += arr[i];   //8
	           }
	           if(i == n-1 && i != lastInd)     jumps++;
	       
	       }
	       return jumps;
	       
	    }
	
}
