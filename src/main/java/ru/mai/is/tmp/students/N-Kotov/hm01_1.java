import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: упс
 * Date: 20.11.13
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class hm01_1 {
 public static void main(String[] args){
                  Input i= new Input();
                  String vvodargumenta;
                  String[] strng=new String[7];
                  while (true){
                  vvodargumenta=i.getUserInput("введите аргумент");
                  if (vvodargumenta==null){
                  System.out.println("вы не ввели");
                  }    else {break;}
                  }
                  for (int f=0;f<10;f++){
                  while (true){
                  strng[f]=i.getUserInput("введите");
                  if (strng[f]==null) {
                  System.out.println("вы не ввели");
                  }    else {break;}
                  }
                  }
                  for (int f=0;f<10;f++) {
                  if (strng[f].contains(vvodargumenta)){
                  System.out.println(strng[f]);
    }
    }

    }
    }