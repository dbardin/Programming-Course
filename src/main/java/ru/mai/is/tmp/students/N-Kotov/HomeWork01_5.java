/**
 * Created with IntelliJ IDEA.
 * User: упс
 * Date: 11.11.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.N-Kotov;

public class HomeWork01_5 {
    public static void main(String[] args) {
        int first = 1;//Первое число
        int second = 1;//Второе число
        int i = 0;//Счетчик количества выведеных чисел
        while (i < 10) {
            System.out.print(first + "," + second + ",");//Выводим два числа
            i = i + 2;
            first = first + second;//меняем первое число присваивая ему значение суммы двух предыдущих
            second = first + second;//меняем второе число присваивая ему значение суммы двух предыдущих
        }
    }
}
