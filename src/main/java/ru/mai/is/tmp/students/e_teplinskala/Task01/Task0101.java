/**

 * Программа, выводящая на экран строчки с искомой информацией
 * Task_01 Задача первая
 */
package ru.mai.is.tmp.students.e_teplinskala.Task01;
import java.util.Scanner;
public class Task01 {
	public static void main(String[] args) {
		System.out.println ("Введите 5 строк, с которыми программа будет работать: ");
		Scanner scan = new Scanner(System.in);
		String a[];
		a = new String[5];		
		a[0] = scan.nextLine();
		a[1] = scan.nextLine();
		a[2] = scan.nextLine();
		a[3] = scan.nextLine();
		a[4] = scan.nextLine();
		System.out.println ("Введите поисковый запрос: ");
		String s=scan.nextLine();
		for (int i=0;i<5; i++) {
			if(a[i].contains(s)) {
				System.out.println(a[i]);
            }
		}
	}
}
