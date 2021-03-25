package codegym;

import java.io.*;

public class Solution1if {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();
		
		String snumber1 = reader.readLine();
		int nnumber1 = Integer.parseInt(snumber1);
		
		String snumber2 = reader.readLine();
		int nnumber2 = Integer.parseInt(snumber2);
		
		System.out.println(name + "will receive " + nnumber1 + " in" + snumber2 + " years.");
				
	}
}


