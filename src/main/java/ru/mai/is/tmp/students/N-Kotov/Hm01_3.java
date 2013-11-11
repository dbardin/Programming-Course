/**
 * Created with IntelliJ IDEA.
 * User: упс
 * Date: 11.11.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
public class Hm01_3 {
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

