import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		System.out.println ("Введите 5 строк: ");
		Scanner scan = new Scanner(System.in);
		String s[];
		s = new String[5];		
		s[0] = scan.nextLine();
		s[1] = scan.nextLine();
		s[2] = scan.nextLine();
		s[3] = scan.nextLine();
		s[4] = scan.nextLine();
		System.out.println ("Текст для поиска:");
		String s=scan.nextLine();
		for (int i=0;i<5; i++) {if(a[i].contains(s)) {System.out.println(a[i]);}}
	}
}
