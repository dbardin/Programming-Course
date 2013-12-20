package ru.mai.is.tmp.students.dmyagkov.task02;
/*
*Квадрат
*/
public class Square extends Shape{
    public Square(){
        name="Квадрат";
    }
    @Override
    public double getArea(double a, double b) {
        if(a>=b){
            a=b;    
        }else{
            b=a;   
        }
        double area=a*b;
        return area;
    }
}    