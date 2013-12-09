/**
 * @author arybalko
 * Programma opredelyaet chetnost'/nechetnost' chisla
 * Task_01 Zadanie 3
 */
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		System.out.print("Vvedite natural'noe chislo: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		if (n%2==0) {
			System.out.println ("Chislo "+n+" chetnoe");
		} else 
			System.out.println ("Chislo "+n+" nechetnoe");
	}	
}

