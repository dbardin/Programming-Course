/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 12.11.13
 * Time: 18:20
 * To change this template use File | Settings | File Templates.
 */

public class Fibonachi {
    public static void main(String[] args){
        int n=10;
      int a=1, b=1;
        System.out.print(a+"  "+b);
         int m=2;
        while(m<n){
          int e=a+b;
            a=b;
            b=e;
            m++;
            System.out.print("  "+e);
        }

    }
}
