/**
 * @author arybalko
 * Программа определяет принадлежность числа промежутку
 * Task_01 Задача 4
 */
import java.util.Scanner;
public class Task0104 {
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

