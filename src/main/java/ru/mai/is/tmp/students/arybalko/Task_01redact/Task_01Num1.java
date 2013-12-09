/**
 * @author arybalko
 * Program which displays lines with desired information
 * Task_01 Program 1
 */
import java.util.Scanner;
public class Task_01Num1 {
	public static void main(String[] args) {
		System.out.println ("Please, enter 5 lines which program will be working with: ");
		Scanner scan = new Scanner(System.in);
		String a[];
		a = new String[5];		
		a[0] = scan.nextLine();
		a[1] = scan.nextLine();
		a[2] = scan.nextLine();
		a[3] = scan.nextLine();
		a[4] = scan.nextLine();
		System.out.println ("Please, enter the search query: ");
		String s=scan.nextLine();
		for (int i=0;i<5; i++) {
			if(a[i].contains(s)) {
				System.out.println(a[i]);
            }
		}
	}
}	