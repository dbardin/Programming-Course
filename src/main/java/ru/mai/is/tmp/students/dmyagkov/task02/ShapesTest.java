package ru.mai.is.tmp.students.dmyagkov.task02;
/*
*Stroki
*
*Программа выводит некоторые характеристики фигур вписаных в прямоугольник
*
*11.12.13
*
*@authorМягков Дмитрий
*/
import java.util.Scanner;
public class ShapesTest {
    private static double width;
    private static double height;
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите высоту прямоугольника,в который будут вписаны фигуры");
        height=scn.nextDouble();
        System.out.println("Введите ширину прямоугольника,в который будут вписаны фигуры");
        width=scn.nextDouble();
        Shape recTri= new RectangularTriangle(); 
        Shape sq=new Square();
        Shape ell=new Ellipse();
        Shape ro=new Round();
        Shape [] myShapes= new Shape[4];
        myShapes[0]=recTri;
        myShapes[1]=sq;
        myShapes[2]=ell;
        myShapes[3]=ro;
        for(Shape figure:myShapes){
            System.out.println(figure.getName()+" имеет площадь:"+figure.getArea(height, width));    
        }
    }  
}