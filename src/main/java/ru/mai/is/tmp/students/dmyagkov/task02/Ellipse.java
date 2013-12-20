package ru.mai.is.tmp.students.dmyagkov.task02;
/*
*Эллипс
*/
public class Ellipse extends Shape implements Circle{
    public Ellipse(){
        name="Эллипс";
    }
    @Override
    public double getArea(double a,double b) {
        double area=(3.14*0.25*a*b);
        return area;
    }
    @Override
    public double getCircleLength(double a, double b) {
        double circleLength = ((4*(3.14*a*b+(a-b)*(a-b)))/(a+b));
        return circleLength;
    }
    @Override
    public double getRadius(double a, double b) {  //сумма малого и большого радиусов
        double radius = (int)(0.5*(a+b)) ;
        return radius;
    }
}