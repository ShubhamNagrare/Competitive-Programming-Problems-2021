package Misclleneous;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Calculate_Cost {
	
//	You are given the prices of  items. You need to remember all the distinct prices.
//
//	The problem is you can remember at most  distinct prices.
//
//	If there are some prices of the items still left to remember, then you need to pay  for each of the prices.
//
//	There are  test cases. For each test case, calculate the cost you need to pay.
	
//	Input format:
//
//		First line consists of a number T, number of test cases.
//
//		For each test cases, first line consists of a number N, the total number of items.
//
//		Second line consists of a number , maximum distinct prices you can remember.
//
//		Third line consists of a number , cost of each price that you were not able to remember.
//
//		Fourth line consists of  numbers, separated by a space, denoting the prices of  items.
//		
//		Output format:
//
//			Output the cost that you need to pay for the prices that you were not able to remember.
//
//
//
//			Constraints:
//
//			1    10
//
//			1    105
//
//			1    
//
//			1    109
//
//			1    109
//
//			Note: Here,  denotes any  item's price out of the given  item prices.
	
	
	public void  solve() {
		
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<t; i++) {
			
			int noOfItems = Integer.parseInt(br.readLine());
			
			int distinctPrices = Integer.parseInt(br.readLine());
			
			int cost = Integer.parseInt(br.readLine());
			
			int[] items = new int[noOfItems];
			for(int j=0; j<noOfItems; j++) {
				items[j] = Integer.parseInt(br.readLine());
			}
			
			System.out.println(getPrice(items, distinctPrices, cost));
		}
		
		}
		catch(Exception e) {
			
		}
			
	}
	
	private int getPrice(int[] items, int distinctPrices, int cost) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<items.length; i++) {
			set.add(items[i]);
		}
		
		int remaining = (items.length - set.size())*cost;
		return remaining > 0 ? remaining : 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
