package String;

public class Check_If_Strings_Are_Rotation_Of_Each_Other {
	
	public void solve() {	
		String s1 = "AACD";
		String s2 = "ACDA";		
		System.out.println(check(s1,s2));		
	}
	
	private boolean check(String s1, String s2) {
		return ((s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1));
	}

}
