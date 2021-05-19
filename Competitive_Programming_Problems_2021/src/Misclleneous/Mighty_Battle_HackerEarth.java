package Misclleneous;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mighty_Battle_HackerEarth {
	
	public void  solve() {
		
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("PRINT FOR A");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("PRINT FOR B");
		for(int i=0; i<n; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}
		
		int answer = getAnswer(a, b, n);
		System.out.println();
		System.out.println("ANSWER");
		System.out.println(answer);
		
		}
		catch(Exception e) {
			
		}	
	}
	
	
	
	private int getAnswer(int[] a, int[] b, int n) {
		
		int[] al = new int[n];
		int[] bl = new int[n];
		
		for(int i=0; i<n; i++) {
			
			int x = al.length > 0 ? a[i] ^ al[i] : a[i] ; 
			int y = bl.length > 0 ? b[i] ^ bl[i] : b[i] ;
			
			if(x > y) {
				bl[i] = b[i];
			}
			else if(x < y)  {
				al[i] = a[i];
			}	
		}
		
		int count=0;
		for(int i=0; i<n; i++) {
			if(bl[i] != 0) {
				count++;
			}
		}
		
		return count;
		
	}

}
