/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 12.11.13
 * Time: 18:20
 * To change this template use File | Settings | File Templates.
 */
<<<<<<< HEAD
package ru.mai.is.tmp.students.azabolotnyi.homework;
public class Fibonachi {
public static void main(String[] args){
int n=10;
int FirstNum=1, SecondNum=1;
System.out.print(FirstNum+"  "+SecondNum);
int m=2;
while(m<n){
int Summa=FirstNum+SecondNum;
FirstNum=SecondNum;
SecondNum=Summa;
m++;
System.out.print("  "+Summa);
}

}
=======

public class Fibonachi {
    public static void main(String[] args){
        int n=10;
      int FirstNum=1, SecondNum=1;
        System.out.print(FirstNum+"  "+SecondNum);
         int m=2;
        while(m<n){
          int Summa=FirstNum+SecondNum;
            FirstNum=SecondNum;
            SecondNum=Summa;
            m++;
            System.out.print("  "+Summa);
        }

    }
>>>>>>> e6873355e50bdf999b7cf97a7a747e03175500a7
}
