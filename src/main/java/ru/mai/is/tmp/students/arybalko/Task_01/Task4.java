/**
 * @author arybalko
 * Programma opredelyaet prinadlezhnost' chisla promezhutku
 * Task_01 Zadanie 4
 */
import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		System.out.print("Vvedite natural'noe chislo ot 0 do 1000: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		if ((n>=0)&(n<=1000)) {
			if ((n>5)&(n<555)) {
				System.out.println (+n+" prinadlezhit intervalu (5; 555)");
			} else {
				System.out.println (+n+" ne prinadlezhit intervalu (5; 555)");	
			} 
		} else { System.out.println (+n+" ne prinadlezhit otrezku [0; 1000]");
		}
	}
}
