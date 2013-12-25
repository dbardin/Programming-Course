package ru.mai.is.tmp.students.dkatkov.kursovaya;

import java.io.*;

public class Kurs{
    public static void main(String[] args) throws IOException{
        //IOException - Если ошибка ввода-вывода происходит
       
        File t = new File("D:\\Otveti.txt"); //Задание пути к файлу
        BufferedReader pir = new BufferedReader(new FileReader(t)); 
        //Создание объекта под названием BufferedReader. Параметр FileReader, 
        //а его параметр - это путь к файлу
        String russian; //Задание переменной
       
   
        
        File f = new File("D:\\Slova.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String slovo; //Задание переменной
        String english; //Задание переменной
        
        
        while ((english = fin.readLine()) != null) {//Цикл прервется, когда будет конец файла
                russian = pir.readLine(); //Отправляем переменной сообщение методом readLine
                System.out.print(english + " - "); //Вывести на экран английское слово
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                //System.in говорит,что ввод будет производиться с клавиатуры
                slovo = br.readLine(); //Присвоение переменной значение введенное с клавиатуры
                if (slovo.equals(russian)) { //Сравнение введенного слова с правильным переводом
                    //сли совпадает
                    System.out.println("Ответ верный"); //Вывести на экран
                }
                else { //Если не совпадает
                    System.out.println("Ответ неверный"); //Вывести на экран
                }
        }
    }
}