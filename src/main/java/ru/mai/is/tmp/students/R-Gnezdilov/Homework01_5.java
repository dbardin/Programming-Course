/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SuPeRhEr0
 */
public class Homework01_5 {
    public static void main(String[] args){
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
