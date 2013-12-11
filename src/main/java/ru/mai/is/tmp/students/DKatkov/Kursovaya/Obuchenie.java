import java.io.*;
public class Obuchenie {
	public static void main(String[] args) {

		class Input {
			public String getUserInput(String prompt) {
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
		
		String[] spisok = {"as", "as well", "affect", "become", "remain", "develop", "development", "enable", "improve", "usually"};//Здесь задается набор слов
		int x = spisok.length;//Считает количество слов в списке
		
		String[] otveti = {"как", "так же", "влиять", "становиться", "оставаться", "развивать", "развитие", "давайть возможность", "улучшать", "обычно"}; //Ввод своего ответа
		int x2 = otveti.length;
		
		while (x>0) {
			x=x-1;//Так как счет в java начинается с 0 вычитаем 1 от значения
			String word = spisok[x];//Присваиваем переменной слово из списка под номером х
			System.out.print(word);//Вывод на экран английского слова
			
			x2 = x2-1;
			String rusWord = otveti[x2];
			
			Input f=new Input();
			String perevod=f.getUserInput("Переведите слово");
			
			if (rusWord==perevod) {//Если введенное слово соответствует правильному ответу
				System.out.println(" - Ответ верный");//Вывести на экран
			}
			else {//Если введенное слово не соответствует правильному ответу
				System.out.println(" - Ответ неверный");
			}
		}
	}

}