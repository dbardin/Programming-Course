/**
 * @author arybalko
 * Программа определяет чётность/нечётность числа
 * Task_01 Задача 3
 */
import java.util.Scanner;
public class Task0103 {
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


