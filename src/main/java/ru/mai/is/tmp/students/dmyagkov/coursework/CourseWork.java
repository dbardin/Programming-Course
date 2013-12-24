package ru.mai.is.tmp.students.dmyagkov.coursework;
/*
 *Сoursework
 *
 *Программа для заучивания слов иностранного языка
 *
 *24.12.13
 *
 *@author Мягков Дмитрий
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CourseWork {

    public static void main(String[] args) throws IOException {
        //IOException - Если ошибка ввода-вывода происходит

        File t = new File("src\\main\\resources\\Otveti.txt"); //Задание пути к файлу
        Scanner scn = new Scanner(t, "UTF-8"); //использовал сканер что бы указать кодировку,BufferedReader у меня читал криво 
        //FileReader fr = new FileReader(t);
        //BufferedReader pir = new BufferedReader(fr);
        //Создание объекта под названием BufferedReader. Параметр FileReader, 
        //а его параметр - это путь к файлу
        String russian; //Задание переменной

        File f = new File("src\\main\\resources\\Slova.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String slovo; //Задание переменной
        String english; //Задание переменной

        while ((english = fin.readLine()) != null) {//Цикл прервется, когда будет конец файла
            //russian = pir.readLine(); //Отправляем переменной сообщение методом readLine
            russian = scn.nextLine();//использование сканера для чтения файла
            System.out.print(english + " - "); //Вывести на экран английское слово
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            //System.in говорит,что ввод будет производиться с клавиатуры
            slovo = br.readLine(); //Присвоение переменной значение введенное с клавиатуры
            if (slovo.equalsIgnoreCase(russian)) { //Сравнение введенного слова с правильным переводом
                //сли совпадает
                System.out.println("Ответ верный"); //Вывести на экран
            } else { //Если не совпадает
                System.out.println("Ответ неверный" + " правильно:" + russian); //Вывести на экран
            }
        }
        fin.close();
    }
}
