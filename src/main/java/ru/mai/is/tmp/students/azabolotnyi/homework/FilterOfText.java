/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 10.11.13
 * Time: 17:46
 * To change this template use File | Settings | File Templates.
 */

import java.util.Scanner;
public class FilterOfText {
       public static void main(String[] args){
          String[] z= new String[]{"Домой","От души душевно в душу","Хочу домой"};

        Scanner scan = new Scanner(System.in);
        String UserWord=scan.nextLine();

         for( int i=0;i<3; i++){
             if(z[i].contains(UserWord)){
                 System.out.println("В предложении<< "+z[i]+" >> найдено введенное слово << "+UserWord+" >>" );
             }
               else System.out.println("В предложении << "+z[i]+" >> введенное слово не найдено.");



         }


       }
}







