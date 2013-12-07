import java.util.Scanner;
public class zadacha3 {
	public static void main(String[] args) {
		System.out.println("Введите число n: ");
		Scanner scan = new Scanner(System.in);
		Integer n = Integer.valueOf(scan.nextLine());
		System.out.print("Число n -  ");
		if (n%2==0) {
		System.out.print("четное!");
		} else {
		System.out.print("нечетное!");
		}
	}
}