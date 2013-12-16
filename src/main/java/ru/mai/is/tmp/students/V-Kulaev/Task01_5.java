/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author V-Kulaev
 */
package ru.mai.is.tmp.students.V-Kulaev;
public class Task01_5 {
    public static void main(String[] args){
       int Chisloper=1;//Первое число
        int Chislovtor=1;//Второе число
        int i=0;//Счетчик количества выведеных чисел
        while(i<10){
            System.out.print(chisloper+","+chislovtor+",");//Выводим два числа
            i=i+2;
            chisloper=chisloper+Chislovtor;//меняем первое число присваивая ему значение суммы двух предыдущих
            Chislovtor=chisloper+Chislovtor;//меняем второе число присваивая ему значение суммы двух предыдущих
        int n=1;//Первое число
        int d=1;//Второе число
        int i=0;//Счетчик количества выведеных чисел
        while(i<10){
            System.out.print(n+","+d+",");//Выводим два числа
            i=i+2;
            n=n+d;//меняем первое число присваивая ему значение суммы двух предыдущих
            d=n+d;//меняем второе число присваивая ему значение суммы двух предыдущих
        }
    }
}
