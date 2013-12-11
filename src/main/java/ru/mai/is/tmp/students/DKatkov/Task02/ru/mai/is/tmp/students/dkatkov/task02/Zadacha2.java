package ru.mai.is.tmp.students.dkatkov.task02;

public class Zadacha2 extends Zadacha5 implements Zadacha1{
     public Zadacha2(){
         
        name="Эллипс";
    }
     
     @Override
     public double getArea(double x,double y) {
        
        double zona=(x*y*3.14*0.25);
        return zona;
    }

    @Override
    public double getCircleLength(double x, double y) {
        
        double circleLength = ((4*(3.14*x*y+(x-y)*(x-y)))/(x+y));
        return circleLength;
    }

    @Override
    public double getRadius(double x, double y) {
        
        double radius = (int)(0.5*(x+y)) ;
        return radius;
    }
    
}
