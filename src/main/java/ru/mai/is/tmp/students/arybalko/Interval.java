/**
 * @author arybalko
 * ��������� ���������� �������������� ����� �������
 * Task_01 ������ 4
 */
import java.util.Scanner;
public class Interval {
	public static void main(String[] args) {
		System.out.print("������� ����������� ����� �� 0 �� 1000: ");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		if ((n>=0)&(n<=1000)) {
			if ((n>5)&(n<555)) {
				System.out.println (+n+" ����������� ��������� (5; 555)");
			} else {
				System.out.println (+n+" �� ����������� ��������� (5; 555)");	
			} 
		} else { System.out.println (+n+" �� ����������� ������� [0; 1000]");
		}
	}
}
