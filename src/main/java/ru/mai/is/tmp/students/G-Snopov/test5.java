package  ru / mai / is / tmp / students / G-Snopov / test5.java ;

/**Java 7
 * NetBeans IDE 7.4
 * Task_01
 * Test_04
 * @author G-Snopov
 * User GS1996
 */
public class Java_homeBin5 {

   
    public static void main(String[] args) {
        //The Fibonacci series is series of numbers where each number is the sum of the two previous matches numbers
        int i = 1 ; 
        int i1 = 1 ;
        int i2 = 0 ; //Greate the first two numbers in the sequence
        System.out.println("") ;
       while (i2<10) 
       {
          System.out.print(i+"" +i1+"") ;
           i2= i2 + 2 ;  
           i = i + i1 ; 
           i1 = i + i1 ;
// A While loop that generates a sequence of 10 integers
        }

    }
    
}
