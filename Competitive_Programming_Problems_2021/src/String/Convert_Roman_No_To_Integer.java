package String;


// TODO
public class Convert_Roman_No_To_Integer {
	
	static int[] values = {1000,500,100,50,10,5,1};
	
	String[] romanLiterals = {"M","D","C","L","X","V","I"};
	
	public void solve() {
		String str = "XXV";
		System.out.println(solve(str));
	}
	
	private int solve(String str) {
		
		System.out.println("Current Roman String is : " + str  );
		
		if(str.length() == 0 ) {
			return -1;
		}
		
		//for()
		
		return -1;
	}

}
