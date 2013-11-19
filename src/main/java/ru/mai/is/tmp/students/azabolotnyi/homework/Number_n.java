/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 10.11.13
 * Time: 20:03
 * To change this template use File | Settings | File Templates.
 */
 import java.util.Scanner;
public class Number_n {

    public static void main(String[] args){
     Scanner scan= new Scanner(System.in);

        int a = scan.nextInt();
        int n=a/100+a/10%10+a%10;
        System.out.println(n);
    }
}
