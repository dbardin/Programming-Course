
public class SChislo {
	public static void main (String[] args) {
		int n = 487, x, y, z, s; //�������� �����
		if (n>99 & n<1000) { //�������� �������, ��� ����� ������ ���� �����������
			x=n/100;
			y=(n-x*100)/10;
			z=n-(x*100+y*10);
			s=x+y+z;
			System.out.println(s);
		}
		else {
			System.out.println("������� �������� �����");
		}
	}

}
