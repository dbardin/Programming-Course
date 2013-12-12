package ru.mai.is.tmp.students.nkormakov.Task01;
import java.util.Scanner;
public class Task2 {
	private static Scanner scan;

	public static void main(String[] args) {
		System.out.print("Введите целое число ");
		scan = new Scanner(System.in);
		int i = scan.nextInt(); int sum=0; int r;
		while (i>0){r=i%10; i=i/10; sum=sum+r;}
		System.out.print("Сумма цифр: "+sum);	
	}
}