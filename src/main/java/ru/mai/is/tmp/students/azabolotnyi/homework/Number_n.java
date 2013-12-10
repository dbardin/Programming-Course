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

        int n = scan.nextInt();
        int SumOfNum=n/100+n/10%10+n%10;
        System.out.println(SumOfNum);
    }
}
