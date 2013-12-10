import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		System.out.print("Введите целое число ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		if (i%2==0) {System.out.println ("Число "+i+" чётное");} 
		else    	{System.out.println ("Число "+i+" нечётное");}
	}	
}


