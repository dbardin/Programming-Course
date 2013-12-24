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
        Scanner scn = new Scanner(t, "UTF-8");
        String russian; //Задание переменной

        File f = new File("src\\main\\resources\\Slova.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String slovo; //Задание переменной
        String english; //Задание переменной

        while ((english = fin.readLine()) != null) {//Цикл прервется, когда будет конец файла
            russian = scn.nextLine();
            System.out.print(english + " - "); //Вывести на экран английское слово
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            //System.in говорит,что ввод будет производиться с клавиатуры
            slovo = br.readLine(); //Присвоение переменной значение введенное с клавиатуры
            if (slovo.equalsIgnoreCase(russian)) { //Сравнение введенного слова с правильным переводом
                //если совпадает
                System.out.println("Ответ верный"); //Вывести на экран
            } else { //Если не совпадает
                System.out.println("Ответ неверный" + " правильно:" + russian); //Вывести на экран
            }
        }
        fin.close();
    }
}
