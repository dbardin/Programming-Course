import java.io.*;
public class Obuchenie {
	public static void main(String[] args) {

		class Input {
			public String setUserInput(String prompt) {
				String inputLine = null;
				System.out.print(" - "+prompt + " - ");
				try {
					BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
					inputLine = is.readLine();
					if (inputLine.length() == 0) return null;
					} 
				catch (IOException e) {
					System.out.println("IOException: " + e);
					}
				return inputLine;
				}
			}
		
		String[] spisok = {"as", "as well", "affect", "become", "remain", "develop", "development", "enable", "improve", "usually"};//����� �������� ����� ����
		int x = spisok.length;//������� ���������� ���� � ������
		
		String[] otveti = {"���", "��� ��", "������", "�����������", "����������", "���������", "��������", "������� �����������", "��������", "������"}; //���� ������ ������
		int x2 = otveti.length;
		
		while (x>0) {
			x=x-1;//��� ��� ���� � java ���������� � 0 �������� 1 �� ��������
			String word = spisok[x];//����������� ���������� ����� �� ������ ��� ������� �
			System.out.print(word);//����� �� ����� ����������� �����
			
			x2 = x2-1;
			String rusWord = otveti[x2];
			
			Input f=new Input();
			String perevod=f.setUserInput("���������� �����");
			
			if (rusWord==perevod) {//���� ��������� ����� ������������� ����������� ������
				System.out.println(" - ����� ������");//������� �� �����
			}
			else {//���� ��������� ����� �� ������������� ����������� ������
				System.out.println(" - ����� ��������");
			}
		}
	}

}