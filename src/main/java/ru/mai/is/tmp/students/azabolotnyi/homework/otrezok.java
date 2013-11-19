/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 11.11.13
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
     import java.util.Scanner;
public class otrezok {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
       if(n<1||n>1000){
           System.out.println("Ошибка! Число "+n+" не входит в заданный диапазон значений (1:1000)");
       }
           else if(n>5&&n<555){
               System.out.println("Число "+n+" принадлежит отрезку (5:555)");
           }
           else System.out.println("Число "+n+" не принадлежит отрезку (5:555)");
       }
    }

