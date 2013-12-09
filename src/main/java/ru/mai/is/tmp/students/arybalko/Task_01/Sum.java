/**
 * @author arybalko
 * Программа считает сумму цифр числа
 * Осмысленные названия переменных
 * Task_01 Задача 2
 */
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		System.out.print("Введите натуральное число: ");
		Scanner scan= new Scanner(System.in);
		int number = scan.nextInt();
		int sum=0;
		int rest;
		while (number>0) {
			rest=number%10;
			number=number/10;
			sum=sum+rest;
		}
		System.out.print("Сумма цифр введенного числа: "+sum);	
	}
}
//Программа работает не только с трехзначными числами, благодаря циклу while

