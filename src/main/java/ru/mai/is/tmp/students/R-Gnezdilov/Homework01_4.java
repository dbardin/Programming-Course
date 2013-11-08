/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SuPeRhEr0
 */
public class Homework01_4 {
    public static void main(String[] args){
        int n= (int) (Math.random()*1000); 
    //Выбираем рандомно число n от 1 до 1000
        if (n>5&n<555) {
            System.out.println("Число "+n+" содержится в интервале (5;555)");
        } else {
            System.out.println("Число "+n+" не содержится в интервале (5;555)");
        }
}
}
