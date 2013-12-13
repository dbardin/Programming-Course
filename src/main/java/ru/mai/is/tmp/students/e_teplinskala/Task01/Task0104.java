/**

 * Принадлежность числа промежутку
 * Task_01 Задача четвертая
 */
package ru.mai.is.tmp.students.e_teplinskala.Task01;
import java.util.Scanner;
public class Task01_4 {
	public static void main(String[] args) {
		System.out.print("Введите натуральное число от 0 до 1000: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		if ((n>=0)&(n<=1000)) {
			if ((n>5)&(n<555)) {
				System.out.println (+n+" принадлежит интервалу (5; 555)");
			} else {
				System.out.println (+n+" не принадлежит интервалу (5; 555)");	
			} 
		} else { System.out.println (+n+" не принадлежит отрезку [0; 1000]");
		}
	}
}

