
package ru.mai.is.tmp.students.nusacheva.tasks.task1;
import java.util.*;
public class Summa {
    static Scanner reader= new Scanner(System.in);
    public static void main (String args[]){
        int summa=0,ostatok;
        System.out.println("Введите трехзначное натуральное число");
        int chislo=reader.nextInt();
        while (chislo>0){
             ostatok=chislo%10;
             summa=summa+ostatok;
             chislo=chislo/10;
        }
        System.out.println(summa);
    }
}
