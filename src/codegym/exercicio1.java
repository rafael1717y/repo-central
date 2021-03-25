package codegym;

import java.io.BufferedReader;
import java.io.*;

public class exercicio1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String snumber = reader.readLine();
		int n = Integer.parseInt(snumber);
		
		if (n > 0) {
			n = n * 2;
			System.out.println(n);
		} else if (n < 0 ){
			n = n + 1;
			System.out.println(n);
		} else {
			System.out.println(n);
		}
	}

}
