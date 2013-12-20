
package ru.mai.is.tmp.students.nusacheva.tasks.task1;
import java.util.Scanner;
public class Text {
    public static void main (String args[]){
        int i,k=0;
        String st;
        String[] stroka=new String[9];

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово-аргумент");
        String argument= scan.nextLine();

        System.out.println("Введите 9 строк");
        for (i=0; i<9; i++){
            stroka[i]=scan.nextLine();
        }

        for (i=0; i<9;i++){
            if (stroka[i].contains(argument)){
                System.out.println(stroka[i]);
                k=1;
            }
        }

        if (k==0)System.out.println("Строк со словом-аргументом нет");




    }
}
