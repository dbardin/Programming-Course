import java.util.Scanner;
 public class zadacha1 {
   public static void main (String[] args) {    
     String arg;    
     Scanner sc = new Scanner(System.in);
     System.out.println ("Input number of strings.");
     int n = sc.nextInt();      
     String[] stroki = new String[n];        
     for (int i=0; i < n; i++){
       stroki[i] = sc.next();
       }        
     System.out.println ("Input arguement.");
     arg = sc.next();     
         for (int i=0; i < n; i++){
           if (stroki[i].contains(arg)) {
         System.out.println(stroki[i]);
         }
         }
     sc.close();
   }
}