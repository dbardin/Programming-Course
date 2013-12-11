package ru.mai.is.tmp.students.dmyagkov.task01;
/*
*Chetnost
*
*Программа определяет четность/нечетность числа
*
*11.12.13
*
*@author Мягков Дмитрий
*/
import java.util.*;
public class Chetnost {
    public static void main(String[] args) {
        int number;
        System.out.println("Введите число");
        Scanner scn= new Scanner(System.in);
        number=scn.nextInt();
        if (number%2==0){
            System.out.println(number+"-четное");
        }else {
            System.out.println(number+"-нечетное");
        }
         
    }
    
}
