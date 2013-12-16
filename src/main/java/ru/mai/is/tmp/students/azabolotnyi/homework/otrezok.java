/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 11.11.13
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
<<<<<<< HEAD
package ru.mai.is.tmp.students.azabolotnyi.homework;
import java.util.Scanner;
public class otrezok {
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int UserNum=scan.nextInt();
if(UserNum<1||UserNum>1000){
System.out.println("Ошибка! Число "+UserNum+" не входит в заданный диапазон значений (1:1000)");
}
else if(UserNum>5&&UserNum<555){
System.out.println("Число "+UserNum+" принадлежит отрезку (5:555)");
}
else System.out.println("Число "+UserNum+" не принадлежит отрезку (5:555)");
}
}
=======
     import java.util.Scanner;
public class otrezok {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int UserNum=scan.nextInt();
       if(UserNum<1||UserNum>1000){
           System.out.println("Ошибка! Число "+UserNum+" не входит в заданный диапазон значений (1:1000)");
       }
           else if(UserNum>5&&UserNum<555){
               System.out.println("Число "+UserNum+" принадлежит отрезку (5:555)");
           }
           else System.out.println("Число "+UserNum+" не принадлежит отрезку (5:555)");
       }
    }
>>>>>>> e6873355e50bdf999b7cf97a7a747e03175500a7

