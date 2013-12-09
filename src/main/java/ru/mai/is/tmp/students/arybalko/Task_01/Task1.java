/**
 * @author arybalko
 * Proshu proshceniya za shrift. Otpraviv svoi raboty na GitHub,
 * vmesto bukv kirillicy napisalis' rombiki
 * Programma, vivodyashaya tol'ko te stroki, gde soderjitsya nuzhnaya informacia
 * Task_01 Zadanie 1
 */
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		System.out.println ("Vvedite 5 strok, kotorye budut rassmatrivat'sa: ");
		Scanner scan = new Scanner(System.in);
		String a[];
		a = new String[5];		
		a[0] = scan.nextLine();
		a[1] = scan.nextLine();
		a[2] = scan.nextLine();
		a[3] = scan.nextLine();
		a[4] = scan.nextLine();
		System.out.println ("Vvedite poiskoviy zapros, vibirayushiy nuzhnie stroki: ");
		String s=scan.nextLine();
		for (int i=0;i<5; i++) {
			if(a[i].contains(s)) {
				System.out.println(a[i]);
            }
		}
	}
}	