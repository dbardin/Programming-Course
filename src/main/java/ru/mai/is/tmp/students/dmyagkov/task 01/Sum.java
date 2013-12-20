package ru.mai.is.tmp.students.dmyagkov.task01;
/*
*Stroki
*
*Программа выводит сумму цифр числа
*
*11.12.13
*
*@author Мягков Дмитрий
*/
import java.util.*;
public class Sum {
    public static void main(String[] args) {
    int sum=0;
    int number,ostatok;
    System.out.println("Введите трехзначное число");
    Scanner scn= new Scanner(System.in);
    number=scn.nextInt();
    while(number>0){
        ostatok=number%10; 
        sum=sum+ostatok;
        number=number/10;
    }
    System.out.println(sum);
    }
}