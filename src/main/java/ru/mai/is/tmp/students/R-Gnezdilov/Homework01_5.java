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
        int Firstchislo=1;//Первое число
        int Secondchislo=1;//Второе число
        int Kolvochisel=0;//Счетчик количества выведеных чисел
        while(Kolvochisel<10){
            System.out.print(Firstchislo+","+Secondchislo+",");//Выводим два числа
            Kolvochisel=Kolvochisel+2;
            Firstchislo=Firstchislo+Secondchislo;//меняем первое число присваивая ему значение суммы двух предыдущих
            Secondchislo=Firstchislo+Secondchislo;//меняем второе число присваивая ему значение суммы двух предыдущих
        }
    }
}
