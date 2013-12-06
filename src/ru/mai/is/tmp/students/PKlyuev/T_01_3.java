import java.util.Scanner;

public class T_01_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println ("Input a number.");
	    int N = sc.nextInt();  
		
		if (N % 2 == 0) {
			System.out.print("Even number.");
		} else {
			System.out.print("Odd number.");
		}
		sc.close();
	}

}
