/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R-Gnezdilov
 */
public class Homework01_2 {
        public static void main(String[] args){
        int n=358;//Любое число n сюда можно  написать
        int c;
        int S=0;
        while (n>0) {
            c=n%10;
            S=S+c;
            n=n/10;
        }
        System.out.println(S);
    }
}
