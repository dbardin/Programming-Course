package ru.mai.is.tmp.students.PKlyuev.Canban;
import java.io.*;
import java.util.Scanner;

public class Insert {	
	String insertion = null;
	int numb = 0;
	
	public void InsertNumber() {		
		Scanner sc = new Scanner(System.in);
		numb = sc.nextInt();
	}	
	
	public void InsertScan() {		
			try {
			BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
			insertion = str.readLine();
			} 
		catch (IOException e) {
			System.out.println(e);
				}
	}	
	
	}
	
	

	

