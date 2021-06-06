package GoogleKickstart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class K_Goodness_String {
	
	// Link : https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068cca3
	
//	
//	Problem
//	Charles defines the goodness score of a string as the number of indices i such that Si≠SN−i+1 where 1≤i≤N/2 (1-indexed). For example, the string CABABC has a goodness score of 2 since S2≠S5 and S3≠S4.
//
//	Charles gave Ada a string S of length N, consisting of uppercase letters and asked her to convert it into a string with a goodness score of K. In one operation, Ada can change any character in the string to any uppercase letter. Could you help Ada find the minimum number of operations required to transform the given string into a string with goodness score equal to K?
//
//	Input
//	The first line of the input gives the number of test cases, T. T test cases follow.
//
//	The first line of each test case contains two integers N and K. The second line of each test case contains a string S of length N, consisting of uppercase letters.
//
//	Output
//	For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the minimum number of operations required to transform the given string S into a string with goodness score equal to K.

	
	// Input
//	2
//	5 1
//	ABCAA		Ans 0
//	4 2
//	ABAA		Ans 1
	
	
	public void solve() {
		
		try{ 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
	        
	        for(int i=0; i<t; i++){
	            
	            int n = Integer.parseInt(br.readLine());
	            int k = Integer.parseInt(br.readLine());
	            
	            String s = br.readLine();
	            int ans = getMinOp(s, n, k);
	            System.out.println(ans);
	            } 
	       	}
	       		catch(Exception e){
	           
	       		}
	        }
	        
	        
	        public static int getMinOp(String s, int n, int k){
	            
	            int j = n-1;
	            int kCount = 0;
	            int i =0;
	            char[] ch = s.toCharArray();
	            
	            while(i<j){
	                
	                if(ch[i] == ch[j]){
	                    kCount++;
	                }
	                i++;
	                j--;
	            }
	            
	            if(kCount == k){
	                return 0;
	            }
	            
	            i = 0;
	            j = n-1;
	           int newCOunt = 0;
	            while(i < j){
	                if(ch[i] != ch[j]){
	                    //ch[i] = ch[j];
	                    kCount++;
	                    newCOunt++;
	                }
	              
	                
	                if(k == kCount){
	                    return newCOunt;
	                }
	                i++;j--;
	                
	            }
	           return kCount; 
	            
	        }

	}
