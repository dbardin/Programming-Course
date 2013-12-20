/**
 * Created with IntelliJ IDEA.
 * User: упс
 * Date: 11.11.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.N-Kotov;

public class HomeWork01_4 {

    public static void main(String[] args) {
        Input t = new Input();
        int chislo;
        while (true) {
            String s = t.getUserInput("Введите число из промежутка [1;1000]");
            chislo = Integer.parseInt(s);
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
