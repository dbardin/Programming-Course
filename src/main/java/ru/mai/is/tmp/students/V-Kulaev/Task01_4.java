/**
 * Created with IntelliJ IDEA.
 * User: V-Kulaev
 * Date: 10.11.13
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.V-Kulaev;
public class Homework01_4_1 {
    public static void main(String[] args){
        Input t=new Input();
        int vvchislo;
        while(true) {
            String s=t.getUserInput("Введите число из промежутка [1;1000]");
            vvchislo=Integer.parseInt(s);
            if (vvchislo<=1000&n>=1) {
                break;
            } else {System.out.println("Вы ввели число, не удовлетворяющее условию");}
        }
        if (vvchislo>5&vvchislo<555) {
            System.out.println("Число "+vvchislo+" содержится в интервале (5;555)");
        } else {
            System.out.println("Число "+vvchislo+" не содержится в интервале (5;555)");
        int n;
        while(true) {
            String s=t.getUserInput("Введите число из промежутка [1;1000]");
            n=Integer.parseInt(s);
            if (n<=1000&n>=1) {
                break;
            } else {System.out.println("Вы ввели число, не удовлетворяющее условию");}
        }
        if (n>5&n<555) {
            System.out.println("Число "+n+" содержится в интервале (5;555)");
        } else {
            System.out.println("Число "+n+" не содержится в интервале (5;555)");
        }
    }
}
