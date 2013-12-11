package ru.mai.is.tmp.students.dkatkov.task02;


public class Zadacha4 extends Zadacha5 implements Zadacha1 {
    public Zadacha4(){
        
        name="Круг";
    }
    @Override
    public double getArea(double x,double y) {
        
        double zona;
        
        if(x>=y){
            
         zona=(int)(3.14*(0.5*y)*(0.5*y));   
        }
        else{
            
         zona=(int)(3.14*(0.5*x)*(0.5*x));   
        }  
        
        return zona;
    }

    @Override
    public double getCircleLength(double x, double y) {
        
        double length;
        
        if(x>=y){
            
         length=(int)(3.14*y);
        }
        else{
            
         length=(int)(3.14*x);   
        }  
        return length;
    }

    @Override
    public double getRadius(double x, double y) {
        
        double radius;
        
        if(x>=y){
            
         radius=(int)(0.5*y);   
        }
        else{
            
         radius=(int)(0.5*x);   
        }   
        return radius;
    }
 }
