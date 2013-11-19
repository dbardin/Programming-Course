import java.util.*;
public class summa {
    static Scanner reader= new Scanner(System.in);
    public static void main (String args[])
    { int s=0,a;
        System.out.println("Введите трехзначное натуральное число");
        int n=reader.nextInt();
        while (n>0){
            a=n%10;
            s=s+a;
            n=n/10;   }
        System.out.println(s);
    }
}
