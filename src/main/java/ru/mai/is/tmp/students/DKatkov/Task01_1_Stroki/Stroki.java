package stroki;
import java.util.*;
public class Stroki {
  public static void main(String[] args) {
        
        System.out.print("Введите слово по которому будет производиться поиск - ");
        
        Scanner s= new Scanner(System.in);
        
        String arg=s.next();
        
        String[] stroki= new String[10];
        
      System.out.println("Введите строки,где будет происходить поиск - ");
      
      int n;
      
       for(n=0;n<10;++n){
       stroki[n]=s.nextLine();
          }
      System.out.print("Строки в которых содержится "+arg+": ");
       
      for(String poisk:stroki){
         String itog=poisk;
          
          if(poisk.contains(arg)){
            System.out.println(itog);//додумать как вывести строку 
          }
      }
   }
}