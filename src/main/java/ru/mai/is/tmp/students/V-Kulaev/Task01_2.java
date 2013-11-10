/**
 * Created with IntelliJ IDEA.
 * User: V-Kulaev
 * Date: 10.11.13
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class Homework01_2_1 {
    public static void main(String[] args){
        Input t=new Input();
        String s=t.getUserInput("Введите число");
        int n=Integer.parseInt(s);
        int c;
        int S=0;
        while (n>0) {
            c=n%10;
            S=S+c;
            n=n/10;
        }
        System.out.println(S);
    }
}
