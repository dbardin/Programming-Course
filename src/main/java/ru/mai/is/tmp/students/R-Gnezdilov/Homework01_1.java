/**
 * Created with IntelliJ IDEA.
 * User: SuPeRhEr0
 * Date: 10.11.13
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public class Homework01_1 {
    public static void main(String[] args){
        Input i= new Input();
        String argument;
        String[] stroka=new String[7];//Создаем массив строк для потока текстовой информации
        while (true){ //Просим ввести аргумент, и проверяем ввели ли его
            argument=i.getUserInput("Введите слово аргумент");
            if (argument==null) {
                System.out.println("Вы не ввели ничего.");
            }    else {break;}
        }
        for (int j=0;j<7;j++){//Просим ввести 7 строк, и проверяем ввели ли их
            while (true){
                stroka[j]=i.getUserInput("Введите строку");
              if (stroka[j]==null) {
                System.out.println("Вы не ввели ничего.");
              }    else {break;}
            }
        }
        for (int j=0;j<7;j++) { //Проверяем содержат ли строки аргумент, и выводим строки, которые содержат аргумент
            if (stroka[j].contains(argument)){
                System.out.println(stroka[j]);
            }
        }

    }
}
