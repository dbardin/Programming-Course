/**
 * Created with IntelliJ IDEA.
 * User: упс
 * Date: 11.11.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
public class Hm01_4 {

        public static void main(String[] args){
              Input t=new Input();
                int n;
                while(true) {
                         String s=t.getUserInput("Введите число из промежутка [1;1000]");
                         n=Integer.parseInt(s);
                        if (n<=1000&n>=1) {
                                  break;
                             } else {System.out.println("Вы ввели число, не удовлетворяющее условию");}
                    }
                if (n>5&n<555) {
                         System.out.println("Число "+n+" содержится в интервале (5;555)");
                     } else {
                          System.out.println("Число "+n+" не содержится в интервале (5;555)");
                     }
            }

}
