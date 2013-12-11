package ru.mai.is.tmp.students.dmyagkov.task01;
/*
*Stroki
*
*Программа выводит первые 10 чисел Фибоначчи
*
*11.12.13
*
*@author Мягков Дмитрий
*/
public class Fibonacci {
    public static void main(String[] args) {
        int number1=1;
        int number2=1;
        for(int i=1;i<11;i++){
            System.out.print(number1+";");
            number2=number2+number1;
            number1=number2-number1;
        }
    }
}