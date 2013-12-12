package ru.mai.is.tmp.students.nkormakov.Task01;
import java.util.Scanner;
public class Task3 {
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.print("Введите целое число ");
		scan = new Scanner(System.in);
		int i = scan.nextInt();
		if (i%2==0) {System.out.println ("Число "+i+" чётное");} 
		else    	{System.out.println ("Число "+i+" нечётное");}
	}	
}