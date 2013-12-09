/**
 * @author arybalko
 * Программа, выводящая только те строки, в которых содержится нужная информация
 * Task_01 Задача 1
 */
import java.util.Scanner;
public class Fraza {
	public static void main(String[] args) {
		System.out.println ("Введите пять строк, которые будут рассматриваться: ");
		Scanner scan = new Scanner(System.in);
		String a[];
		a = new String[5];		
		a[0] = scan.nextLine();
		a[1] = scan.nextLine();
		a[2] = scan.nextLine();
		a[3] = scan.nextLine();
		a[4] = scan.nextLine();
		System.out.println ("Введите поисковый запрос, выбирающий нужные строки: ");
		String s=scan.nextLine();
		for (int i=0;i<5; i++) {
			if(a[i].contains(s)) {
				System.out.println(a[i]);
            }
		}
	}
}	
