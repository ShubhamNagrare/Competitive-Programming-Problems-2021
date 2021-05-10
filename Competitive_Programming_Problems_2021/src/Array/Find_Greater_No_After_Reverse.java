package Array;

public class Find_Greater_No_After_Reverse {

	public void findgreater() {
		
        int[] n = new int[2];
        n[0] = 12;
        n[1] = 100;


    int [] ans = new int[2];
    
    for(int j=0; j<2; j++){

    int rev=0; int remainder;
    int k = n[j];
    while(k !=0){
    	remainder = k % 10;
        rev = rev * 10 + remainder;
        k = k/10;
    }

    ans[j] = rev;
    }

    if(ans[0] > ans[1]){

        System.out.println(ans[0]);
    }
    else{
        System.out.println(ans[1]);
    }

		
		
	}
	
	
}
