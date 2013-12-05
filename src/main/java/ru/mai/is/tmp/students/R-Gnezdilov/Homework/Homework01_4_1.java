/**
 * Created with IntelliJ IDEA.
 * User: SuPeRhEr0
 * Date: 10.11.13
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.R-Gnezdilov.Homework;

public class Homework01_4_1 {
    public static void main(String[] args) {
        Input t = new Input();
        int chislo;
        while (true) {
            String stroka = t.getUserInput("Введите число из промежутка [1;1000]");
            chislo = Integer.parseInt(stroka);
            if (chislo <= 1000 & chislo >= 1) {
                break;
            } else {
                System.out.println("Вы ввели число, не удовлетворяющее условию");
            }
        }
        if (chislo > 5 & chislo < 555) {
            System.out.println("Число " + chislo + " содержится в интервале (5;555)");
        } else {
            System.out.println("Число " + chislo + " не содержится в интервале (5;555)");
        }
    }
}
