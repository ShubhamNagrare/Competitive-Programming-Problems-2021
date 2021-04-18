package Array;

public class FInd_Length_Of_Longest_unique_Subsequence_String {
	
	//static String[] seqStrArr = new String[3];	// ["ab","cb","cd"]
	//seqStrArr[0] = "ab";
	//seqStrArr[1] = "cb";
	//seqStrArr[2] = "cd";
	
	private static boolean isDuplicate(String longest, String current) {
		for(int i=0; i<longest.length(); i++) {
			if(true) {
				return true;
			}
		}
		return false;
	}
	
	private String checkUnique(String[] arr, int index, String longest) {
		
		if((longest.length() + arr[index].length()) > 26) {
			return longest;
		}
		
		//checkUnique(arr, )
		
		return null;
	}
	
	public static String getLongestUniqueSubString(String[] seqStrArr) {
		if(seqStrArr.length == 0) {
			return null;
		}
		
		if(seqStrArr.length == 0) {
			return seqStrArr[0];
		}
		
		
		String longest = "";
		
		
		
		
		
		return "";
	}
	
}
