package ru.mai.is.tmp.students.PKlyuev.t_01_2;
public class T_01_2 {
	
	public static void main(String[] args) { 
		
		int n = 999;
		n = (n % 10)+((n/10)%10)+n/100;
		System.out.print(n);
	}
	
}