
package ru.mai.is.tmp.students.nusacheva.tasks.task1;
public class Interval {
    public static void main (String args[]){
        int chislo;
        chislo=(int) (1+Math.random()*1000);
        System.out.println(chislo);
        if ((chislo>5) & (chislo<555)) {
            System.out.println("N попадает в интервал");
        }
        else
            System.out.println("N не попадает в интервал");
    }

}
