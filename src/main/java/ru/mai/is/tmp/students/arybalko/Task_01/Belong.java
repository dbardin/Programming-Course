/**
 * @author arybalko
 * Программа определяет принадлежность числа промежутку
 * Осмысленные названия переменных
 * Task_01 Задача 4
 */
import java.util.Scanner;
public class Belong {
	public static void main(String[] args) {
		System.out.print("Введите натуральное число от 0 до 1000: ");
		Scanner scan= new Scanner(System.in);
		int number = scan.nextInt();
		if ((number>=0)&(number<=1000)) {
			if ((number>5)&(number<555)) {
				System.out.println (+number+" принадлежит интервалу (5; 555)");
			} else {
				System.out.println (+number+" не принадлежит интервалу (5; 555)");	
			} 
		} else { System.out.println (+number+" не принадлежит отрезку [0; 1000]");
		}
	}
}

