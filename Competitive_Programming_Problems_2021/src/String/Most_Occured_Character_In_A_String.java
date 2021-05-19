package String;

public class Most_Occured_Character_In_A_String {
	
	
	// https://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/
	
	public void solve(){
		
		String str = "HappyIndepencenceDay";
		
		int[] count = new int[256];		
		
		System.out.println(getMaxOccured(str, str.length() , count));
		
	}
	
	private char getMaxOccured(String str, int n, int[] count){
		
		for(int i=0; i<n; i++) {
			char j = str.charAt(i);			
			count[j]++;
		}
		
		int max = -1;
		char result = ' ';
		
		
		   for (int i = 0; i < n; i++) {
	            if (max < count[str.charAt(i)]) {
	                max = count[str.charAt(i)];
	                result = str.charAt(i);
	            }
	        }
		
		return result;
	
		
	}
	
	
	

}
