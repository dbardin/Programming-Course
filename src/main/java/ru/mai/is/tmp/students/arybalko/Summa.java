/**
 * @author arybalko
 * ��������� ������� ����� ���� �����
 * Task_01 ������ 2
 */
import java.util.Scanner;
public class Summa {
	public static void main(String[] args) {
		System.out.print("������� ����������� �����: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int s=0;
		int a;
		while (n>0) {
			a=n%10;
			n=n/10;
			s=s+a;
		}
		System.out.print("����� ���� ���������� �����: "+s);	
	}
}
//��������� �������� �� ������ � ������������ �������, ��������� ����� while