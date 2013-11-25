package  ru / mai / is / tmp / students / G-Snopov / test1.java ;


/**Java 7
 *NetBeans IDE 7.4
 * Task_01
 * Test_01
 * User GS1996
 * @author G-Snopov
 */
 
import java.util.Scanner ;
public class Java_homeBin1 {
public static void main(String[] args) {
         int i  ;   
        int l = 0 ; 
        String ab ; 
        String[] a = new String[10] ; //Greate an array of length 10 lines
      Scanner scan = new Scanner( System.in )  ; 
      System.out.println("Enter the search query" ) ;//Introdused something that should be as an argument
        String j = scan.nextLine() ;
        System.out.println("Greate a 10 list of strings to activate the search query" ) ;//Fill the created array 
        for (i=0;i<10;i++)
        { 
            a[i] = scan.nextLine() ; 
        }
        for (i=0;i<10;i++) 
        {
            if (a[i].contains(j))
            { 
                System.out.println(a[i]) ; 
           l = 1 ;  
         //If no argument in the list array, the program will display an emply field no result
        }
        
         }
        }

    }
