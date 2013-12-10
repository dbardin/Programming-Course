import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		System.out.print("Введите целое число от 0 до 1000 ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		if ((i>=0)&(i<=1000)) {
			if ((i>5)&(i<555)) {System.out.println ("Число "+i+" принадлежит интервалу (5; 555)");} 
			else               {System.out.println ("Число "+i+" не принадлежит интервалу (5; 555)");} 
		    }   
		else {System.out.println ("Число "+i+" не принадлежит интервалу [0; 1000]");}
	}
}

