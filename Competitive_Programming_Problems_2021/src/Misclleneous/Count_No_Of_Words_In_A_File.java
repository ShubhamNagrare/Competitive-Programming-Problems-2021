package Misclleneous;

import java.io.File;
import java.io.FileInputStream;

public class Count_No_Of_Words_In_A_File {
	
	public void solve() {
		
		int count =0;
		String path = "C:\\Users\\91973\\Desktop\\Personal\\Designing Data Intensive Applications Notes.txt";
		
		try {
		File f = new File(path);
		FileInputStream fs = new FileInputStream(f);
		byte[] br = new byte[(int)f.length()];
		fs.read(br);
		
		String s = new String(br);
		
		String[] str = s.split(" ");
		
		for(int i=0; i<str.length; i++) {
			count ++;
		}
		
		System.out.println("COUNT OF WORDS ID  :  " + count );
		
		}
		catch(Exception e) {
			
		}
		
		
		
	}

}
