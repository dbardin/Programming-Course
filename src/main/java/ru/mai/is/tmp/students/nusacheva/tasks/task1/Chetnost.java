
package ru.mai.is.tmp.students.nusacheva.tasks.task1;
import java.util.*;
public class Chetnost {
    static Scanner reader= new Scanner(System.in);
    public static void main (String args[]){
        System.out.println("Введите число");
        int chislo=reader.nextInt();
        if (chislo%2==0){
            System.out.println("Число четное");
        }
        else
            System.out.println("Число нечетное");
    }
}
