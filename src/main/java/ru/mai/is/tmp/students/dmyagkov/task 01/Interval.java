package ru.mai.is.tmp.students.dmyagkov.task01;
/*
*Stroki
*
*Программа определяет входит ли число в интервал
*
*11.12.13
*
*@author Мягков Дмитрий
*/
import java.util.*;
public class Interval {
    public static void main(String[] args) {
        int number;
        System.out.println("Введите  число");
        Scanner scn= new Scanner(System.in);
        number=scn.nextInt();
        if ((number>5)&&(number<555)){
            System.out.println("Число входит в интервал(5;555)");
        }
        else{ 
            System.out.println("Число не входит в интервал(5;555)");
        } 
    }
}
