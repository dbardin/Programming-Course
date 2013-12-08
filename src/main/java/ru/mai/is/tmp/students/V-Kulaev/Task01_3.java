/**
 * Created with IntelliJ IDEA.
 * User: V-Kulaev
 * Date: 10.11.13
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class Homework01_3_1 {
    public static void main(String[] args){
        Input t=new Input();
        String s=t.getUserInput("Введите число");
        int vvchislo=Integer.parseInt(s);
        if (vvchislo%2==0) {
        int n=Integer.parseInt(s);
        if (n%2==0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
