/**
 * @author arybalko
 * ���������, ������������� ������ 10 ����� ���������
 * Task_01 ������ 5
 */
public class Fibonacci {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int i=0;
		System.out.print ("������ 10 ����� ���� ���������: ");
			while(i<10){
				System.out.print(a+" "+b+" ");
				i=i+2;
				a=a+b;
				b=a+b;
			}
	}
}