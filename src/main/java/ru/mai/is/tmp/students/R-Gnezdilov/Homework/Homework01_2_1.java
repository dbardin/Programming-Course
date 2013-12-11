/**
 * Created with IntelliJ IDEA.
 * User: SuPeRhEr0
 * Date: 10.11.13
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.R-Gnezdilov.Homework;

public class Homework01_2_1 {
    public static void main(String[] args) {
        Input t = new Input();
        String stroka = t.getUserInput("Введите число");
        int chislo = Integer.parseInt(stroka);
        int OstatokOtDeleniya;
        int Summa = 0;
        while (chislo > 0) {
            OstatokOtDeleniya = chislo % 10;
            Summa = Summa + OstatokOtDeleniya;
            chislo = chislo / 10;
        }
        System.out.println(Summa);
    }
}
