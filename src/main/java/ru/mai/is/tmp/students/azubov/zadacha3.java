import java.util.Scanner;
public class zadacha3 {
	public static void main(String[] args) {
		System.out.println("������� ����� n: ");
		Scanner scan = new Scanner(System.in);
		Integer n = Integer.valueOf(scan.nextLine());
		System.out.print("����� n -  ");
		if (n%2==0) {
		System.out.print("������!");
		} else {
		System.out.print("��������!");
		}
	}
}