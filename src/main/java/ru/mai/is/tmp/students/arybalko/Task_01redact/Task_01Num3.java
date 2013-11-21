/**
 * @author arybalko
 * Program program defines the parity/unparity of the number
 * Task_01 Program 3
 */
import java.util.Scanner;
public class Task_01Num3 {
	public static void main(String[] args) {
		System.out.print("Please, enter the natural number: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		if (n%2==0) {
			System.out.println ("Number "+n+" is parity");
		} else 
			System.out.println ("Number "+n+" is unparity");
	}	
}

