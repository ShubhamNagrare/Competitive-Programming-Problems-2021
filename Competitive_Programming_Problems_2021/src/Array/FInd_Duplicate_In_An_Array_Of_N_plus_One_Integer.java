package Array;

public class FInd_Duplicate_In_An_Array_Of_N_plus_One_Integer {

	//Question reference : https://leetcode.com/problems/find-the-duplicate-number/
	
	//	Input: nums = [1,3,4,2,2]
	//	Output: 2
	
	public static int findDuplicate(int[] nums) {
		int count =0;
		int curr = 0;
		int n = nums.length-1;
		
		for(int i=0; i<nums.length; i++)
			
			
			count+= nums[i];
		
		return count - (n*(n+1)/2);
	}
	
	
}
