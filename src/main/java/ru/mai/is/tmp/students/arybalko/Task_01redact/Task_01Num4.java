/**
 * @author arybalko
 * Program determines whether the number of intervals
 * Task_01 Program 4
 */
import java.util.Scanner;
public class Task_01Num4 {
	public static void main(String[] args) {
		System.out.print("Please, enter the natural number from 0 to 1000: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		if ((n>=0)&(n<=1000)) {
			if ((n>5)&(n<555)) {
				System.out.println ("Number "+n+" belongs to the interval (5; 555)");
			} else {
				System.out.println ("Number "+n+" does not belong to the interval (5; 555)");	
			} 
		} else { System.out.println ("Number "+n+" does not belong to the interval [0; 1000]");
		}
	}
}
