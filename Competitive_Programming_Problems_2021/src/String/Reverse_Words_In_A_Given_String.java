package String;

public class Reverse_Words_In_A_Given_String {
	
	public void solve() {
		
		String s = "i like this program very much";
		
		String[] str = s.split(" ");
		
		String newStr = "";
		for(int i=str.length-1; i>=0; i--) {
			newStr += str[i] + " ";
		}
		
		System.out.println( newStr);
		
		
		
		
	}

}
