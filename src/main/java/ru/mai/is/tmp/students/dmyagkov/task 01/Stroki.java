package ru.mai.is.tmp.students.dmyagkov.task01;
/*
*Stroki
*
*Программа выводит строчки с ключевым словом
*
*11.12.13
*
*@author Мягков Дмитрий
*/
import java.util.*;

public class Stroki {
    public static void main(String[] args) {
        int i;
        String argyment;
        System.out.println("Введите слово-запрос");
        Scanner scn= new Scanner(System.in);
        argyment=scn.nextLine();
        String[] strokipotoka= new String[10];
        System.out.println("Введите 9 строк,в которых будет осуществляться поиск");
        for(i=0;i<10;++i){
           strokipotoka[i]=scn.nextLine();
        }
        System.out.println("Строки содержащие "+argyment+":");
        String vivod;
        for(String poisk:strokipotoka){
            vivod=poisk;
            if((poisk.toLowerCase().indexOf(argyment.toLowerCase()) != -1) ){
                System.out.println(vivod);
            }
        }
    }
}