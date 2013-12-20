package ru.mai.is.tmp.students.dmyagkov.task02;
/*
*Прямоугольный треугольник
*/
public class RectangularTriangle extends Shape { 
    public RectangularTriangle(){
        name="Прямоугольный треугольник";
    }
    @Override
    public double getArea(double a,double b){
        double area=(0.5*(a*b));
        return area;
    }
    public double getPerimeter(double a,double b){
        double perimetr=(a+b+Math.sqrt(a*a+b*b));
        return perimetr;
    }
}