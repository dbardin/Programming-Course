
package ru.mai.is.tmp.students.nusacheva.tasks.task1;
public class Fibonachi {
    public static void main (String args[]) {
        int summaDvuhChisel,chislo1=1,chislo2=1;
        System.out.println(chislo1);
        System.out.println(chislo2);
        for (int i=3; i<11; i++){
               summaDvuhChisel=chislo1+chislo2;
               System.out.println(summaDvuhChisel);
               chislo1=chislo2;
               chislo2=summaDvuhChisel;
        }

    }
}
