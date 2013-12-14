/**
 * @author arybalko
 * Программа, выводящая на экран строчки с искомой информацией
 * Task_01 Задача 1
 */
package ru.mai.is.tmp.students.arybalko.Task_01;
import java.util.Scanner;
public class FindLine {
	public static void main(String[] args) {
		System.out.println ("Введите 5 строк, с которыми программа будет работать: ");
		Scanner scan = new Scanner(System.in);
		String line[];
		line = new String[5];		
		line[0] = scan.nextLine();
		line[1] = scan.nextLine();
		line[2] = scan.nextLine();
		line[3] = scan.nextLine();
		line[4] = scan.nextLine();
		System.out.println ("Введите поисковый запрос: ");
		String find=scan.nextLine();
		for (int i=0;i<5; i++) {
			if(line[i].contains(find)) {
				System.out.println(line[i]);
            }
		}
	}
}
