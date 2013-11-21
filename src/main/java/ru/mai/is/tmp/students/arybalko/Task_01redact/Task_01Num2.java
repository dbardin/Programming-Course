/**
 * @author arybalko
 * Program is counting amount of digits 
 * Task_01 Program 2
 */
import java.util.Scanner;
public class Task_01Num2 {
	public static void main(String[] args) {
		System.out.print("Please, enter the natural number: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int s=0;
		int a;
		while (n>0) {
			a=n%10;
			n=n/10;
			s=s+a;
		}
		System.out.print("Total: "+s);	
	}
}
//Program is working not only with three-figured numbers because using "while" cycle
