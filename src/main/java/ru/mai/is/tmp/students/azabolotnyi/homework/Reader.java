/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 10.11.13
 * Time: 17:46
 * To change this template use File | Settings | File Templates.
 */

import java.util.Scanner;
public class Reader {
       public static void main(String[] args){
          String[] z= new String[]{"Домой","От души душевно в душу","Хочу Домой"};

        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();

         for( int i=0;i<3; i++){
             if(z[i].contains(s)){
                 System.out.print(z[i]);
             }
               else System.out.println();



         }


       }
}







