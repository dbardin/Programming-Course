
import java.util.*;
public class chetnost {
    static Scanner reader= new Scanner(System.in);
    public static void main (String args[]){
        System.out.println("Введите число");
        int n=reader.nextInt();
        if (n%2==0) {System.out.println("Число четное");}
        else System.out.println("Число нечетное");
    }
}
