/**
 * 
 * @author arybalko
 * ��������� ���������� ��������/���������� �����
 * Task_01 ������ 3
 */
import java.util.Scanner;
public class Chetnost {
	public static void main(String[] args) {
		System.out.print("������� ����������� �����: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		if (n%2==0) {
			System.out.println ("����� "+n+" ������");
		} else 
			System.out.println ("����� "+n+" ��������");
	}	
}

