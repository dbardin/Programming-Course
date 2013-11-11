/**
 * Created with IntelliJ IDEA.
 * User: упс
 * Date: 11.11.13
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
public class Hm01_5 {
          public static void main(String[] args){
                  int n=1;//Первое число
                  int d=1;//Второе число
                  int i=0;//Счетчик количества выведеных чисел
                  while(i<10){
                          System.out.print(n+","+d+",");//Выводим два числа
                          i=i+2;
                          n=n+d;//меняем первое число присваивая ему значение суммы двух предыдущих
                          d=n+d;//меняем второе число присваивая ему значение суммы двух предыдущих
                      }
        }
}
