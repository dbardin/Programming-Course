/**
 * Created with IntelliJ IDEA.
 * User: Эля
 * Date: 18.11.13
 * Time: 18:11
 * To change this template use File | Settings | File Templates.
 */
public class Zadacha1_2 {

     public static void main (String args[]){
        int n=508;
int summa;
summa= n/100+((n-n/100)*100/10)+(n-(n/100)*100)-((((n-(n/100)*100/10))*10));
System.out.println (summa);
        }
                }