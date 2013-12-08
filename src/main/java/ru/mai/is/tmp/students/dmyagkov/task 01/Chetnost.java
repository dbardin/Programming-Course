
package chetnost;
import java.util.*;
public class Chetnost {

    public static void main(String[] args) {
         int number;
         System.out.println("Введите число");
         Scanner scn= new Scanner(System.in);
         number=scn.nextInt();
         if (number%2==0){System.out.println(number+"-четное");}
          else System.out.println(number+"-нечетное");
         
    }
    
}
