/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.12.13
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */
package ru.mai.is.tmp.students.azabolotnyi.homework;
public class Orange extends Fruits  {
    private String Color;
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        if(Color.contains("оранжевый")){
            this.Color=Color;
        } else this.Color="оранжевый"; }

    public void eat(){
        System.out.println("Я съел "+getColor()+" апельсин размером "+getSize());
    }
    public void cut(){
        System.out.println("Я почистил апельсин");
    }
}
