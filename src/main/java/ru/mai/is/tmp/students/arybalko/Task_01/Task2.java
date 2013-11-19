/**
 * @author arybalko
 * Programma schitaet summu cifr chisla
 * Task_01 Zadanie 2
 */
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		System.out.print("Vvedite natural'noe chislo: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int s=0;
		int a;
		while (n>0) {
			a=n%10;
			n=n/10;
			s=s+a;
		}
		System.out.print("Summa cifr vvedennogo chisla: "+s);	
	}
}
//Programma rabotayet ne tol'ko s tryohzhachnimi chislami, blagodarya ciklu while
