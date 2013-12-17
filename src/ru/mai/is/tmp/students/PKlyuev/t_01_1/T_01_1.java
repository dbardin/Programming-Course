package t_01_1;

import java.io.*;
import java.util.Scanner;

public class T_01_1 {	
	public static void main(String[] args) {
		
		
		Scanner kolvo = new Scanner(System.in);
		System.out.println("Input number of strings.");
		int n = kolvo.nextInt();
		String[] stroki = new String[n];
		
		
		
		System.out.println("Input strings.");		
		for (int i = 0; i < n; i++) {
			try {
				BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
				stroki[i] = str.readLine();
				} 
			catch (IOException e) {
				System.out.println(e);
					}
		}

		
		System.out.println("Input arguement.");		
		String arg = null;		
		try {
			BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
			arg = str.readLine();
			} 
		catch (IOException e) {
			System.out.println(e);
				}

		
		for (int i = 0; i < n; i++) {
			if (stroki[i].contains(arg)) {
				System.out.println(stroki[i]);
			}
		
		}
		kolvo.close();
	}
}


