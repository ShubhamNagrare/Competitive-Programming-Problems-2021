package Data_Structure_And_Algorithms_Level_Up_Course_Udemy;

public class FizzBuzz {
	
	
	public void solve() {
		
		int n = 20;

		int a=0;
		int b=0;
		for(int i=1; i<=n; i++) {
			
			a++;
			b++;
			boolean flag = false;
						
			if(a==3){
				System.out.print("Fizz");
				a = 0;
				flag = true;
			}
			
			if(b==5) {
				System.out.print("Buzz");
				b =0;
				flag = true;
			}
			
			if(!flag) {
				System.out.print(i);
			}
			
			System.out.println();	
		}	
	}


}
