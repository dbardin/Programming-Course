package  ru / mai / is / tmp / students / G-Snopov / test4.java ;

import java.util.Scanner;

/**Java 7
 * NetBeans IDE 7.4
 * Task_01
 * Test_05
 * @author G-Snopov
 * User GS1996
 */
public class Java_homeBin4 {

    
    public static void main(String[] args) {
      System.out.print("Enter any number: ") ; 
        Scanner scan = new Scanner(System.in) ; 
        int q = scan.nextInt() ; 
       if ((q>=0)&(q<=1000)) {
           if ((q>=5)&(q<=555)) {
            System.out.println("Number q is in the defined period [5;555]") ;
    }    
 else {
            System.out.println("Number q is not in the defined period [5;555]") ;
    } 
    }
    else { 
    System.out.println("System ERROR");
}
}
        
}
