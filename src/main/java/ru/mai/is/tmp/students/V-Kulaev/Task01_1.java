/**
 * Created by Владислав on 11.12.13.
 */
package ru.mai.is.tmp.students.V-Kulaev;

public class Task01_1 {
    public static void main(String[] args){
        Input i = new Input();
        String argument;
        String[] stroka = new String[7];//Создаем массив строк для потока информации
        while (true){ //Вводим аргумент, и проверяем ввели ли его
            argument = i.getUserInput("Введите аргумент");
            if (argument == null) {
                System.out.println("Вы ввели пустую строку.");
            }    else {break;
            }
        }
        for (int j = 0 ; j < 7; j++){//Вводим  7 строк, и проверяем ввели ли их
            while (true){
                stroka[j] = i.getUserInput("Введите строку");
                if (stroka[j] == null) {
                    System.out.println("Вы ввели пустую строку.");
                }    else {
                    break;
                }
            }
        }
        for (int j = 0; j < 7; j++) { //Проверяем содержат ли строки аргумент, и выводим строки, которые содержат аргумент
            if (stroka[j].contains(argument)){
                System.out.println(stroka[j]);
            }
        }

    }
}
