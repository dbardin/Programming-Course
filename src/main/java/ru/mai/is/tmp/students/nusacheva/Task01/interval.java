
public class interval {
    public static void main (String args[]){
        int n;
        n=(int) (1+Math.random()*1000);
        System.out.println(n);
        if ((n>5) & (n<555)) {System.out.println("N попадает в интервал");}
           else System.out.println("N не попадает в интервал");
    }

}
