public class zadacha4 {
	public static void main(String args[]){
		final int a = 1;
		final int b = 1000;
		int c = (int)(a + Math.random()*(b-a+1));
		if (c >= 5 && c <= 555) {
		System.out.println("����� " + c + " ���������� � ��������� (5;555)");
		}
		else {
		System.out.println("����� " + c + " �� ���������� � ��������� (5;555)");
		}
	}
}