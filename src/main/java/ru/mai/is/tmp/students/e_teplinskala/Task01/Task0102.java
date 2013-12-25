/**
 * Сумму цифр числа
 * Task_01 Задача вторая
 */
package ru.mai.is.tmp.students.e_teplinskala.Task01;
import java.util.Scanner;
public class Task0102 {
	public static void main(String[] args) {
		System.out.print("Введите натуральное число: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int s=0;
		int a;
		while (n>0) {
			a=n%10;
			n=n/10;
			s=s+a;
		}
		System.out.print("Сумма цифр введенного числа: "+s);	
	}
}


