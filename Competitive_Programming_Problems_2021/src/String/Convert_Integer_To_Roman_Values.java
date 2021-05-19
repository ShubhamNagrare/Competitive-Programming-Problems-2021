package String;

public class Convert_Integer_To_Roman_Values {
	
	
	static int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	
	String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	
	
	public void solve() {
		
		System.out.println(getRoman(25));
		
	}
	
	private String getRoman(int num) {
		
		System.out.println("Current Integer : " + num);
		StringBuilder br = new StringBuilder();
		
		for(int i=0; i<values.length; i++) {
			while(num >= values[i]) {
				
				num = num - values[i];
				br.append(romanLiterals[i]);
			}
		}
		return br.toString();
	}

}
