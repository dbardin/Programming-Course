package ru.mai.is.tmp.students.dkatkov.task02 ;
public class Zadacha7 extends Zadacha5{
    public Zadacha7(){
        name="Квадрат";
    }
    
    @Override
    public double getArea(double a, double b) {
        if(a>=b){
        a=b;    
        }
        else{
         b=a;   
        }
        double area=a*b;
        return area;
    }
    
}
