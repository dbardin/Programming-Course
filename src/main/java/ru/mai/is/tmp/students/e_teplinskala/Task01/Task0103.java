/**

 * Чётность/нечётность числа
 * Task_01 Задача тертья
 */
package ru.mai.is.tmp.students.e_teplinskala.Task01;
import java.util.Scanner;
public class Task01_3 {
	public static void main(String[] args) {
		System.out.print("Введите натуральное число: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		if (n%2==0) {
			System.out.println ("Число "+n+" чётное");
		} else 
			System.out.println ("Число "+n+" нечётное");
	}	
}


