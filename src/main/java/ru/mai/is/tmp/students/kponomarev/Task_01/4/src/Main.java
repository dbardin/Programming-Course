/**
 * Created with IntelliJ IDEA.
 * Student: Клим Пономарев
 * Group: 4О-109Б
 * Date: 30.11.13
 * Time: 18:05
 */
public class Main {
    public static void main(String args[]){
        final int a = 1;
        final int b = 1000;
        int c = (int)(a + Math.random()*(b-a+1));
        if (c >= 5 && c <= 555) {
            System.out.println("Число " + c + " содержится в интервале (5;555)");
        }
        else {
            System.out.println("Число " + c + " не содержится в интервале (5;555)");
        }
    }
}
