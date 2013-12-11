package ru.mai.is.tmp.students.dmyagkov.task02;
/*
*Круг
*/
public class Round extends Shape implements Circle {
    public Round(){
        name="Круг";
    }
    @Override
    public double getArea(double a,double b) {
        double area;
        if(a>=b){
            area=(int)(3.14*(0.5*b)*(0.5*b));   
        }else{
            area=(int)(3.14*(0.5*a)*(0.5*a));   
        }  
        return area;
    }
    @Override
    public double getCircleLength(double a, double b) {
        double length;
        if(a>=b){
            length=(int)(3.14*b);
        }else{
            length=(int)(3.14*a);   
        }  
        return length;
    }
    @Override
    public double getRadius(double a, double b) {
        double radius;
        if(a>=b){
           radius=(int)(0.5*b);   
        }else{
            radius=(int)(0.5*a);   
        }   
        return radius;
    }
}    