package ru.mai.is.tmp.students.dkatkov.task02 ;
public class Zadacha3 extends Zadacha5 { 
    public Zadacha3(){
        
        name="Прямоугольный треугольник";
    }
   
    @Override
    public double getArea(double x,double y){
        
        double zona=(0.5*(x*y));
        return zona;
      }
    public double getPerimetr(double x,double y){
        
        double perimetr=(x+y+Math.sqrt(x*x+y*y));
        return perimetr;
    }
}
