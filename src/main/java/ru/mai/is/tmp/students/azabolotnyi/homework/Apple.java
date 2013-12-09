/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.12.13
 * Time: 19:35
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.azabolotnyi.homework;
 public class Apple extends Fruits   {
    private String Color;
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        if(Color.contains("Красное")){
            this.Color=Color;
        } else this.Color="красное"; }
     public void eat(){
        System.out.println("Я съел яблоко");
    }
    public void cut(){
       System.out.println("Я разрезал "+getColor()+ " яблоко размером "+getSize());
     }
}
