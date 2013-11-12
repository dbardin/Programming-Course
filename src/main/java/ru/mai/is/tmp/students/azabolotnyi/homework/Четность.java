/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 11.11.13
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
      import java.util.Scanner;
public class Четность {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        if(n%2==0){
            System.out.print("Число " +n+ " четное");
        }
        else
            System.out.print("Число " +n+ " нечетное");
    }
}
