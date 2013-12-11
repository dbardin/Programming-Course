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
        Shape [] myShapes= new Shape[4];
        RectangularTriangle recTri= new RectangularTriangle(); 
        myShapes[0]=recTri;
        Square sq=new Square();
        myShapes[1]=sq;
        Ellipse ell=new Ellipse();
        myShapes[2]=ell;
        Round ro=new Round();
        myShapes[3]=ro;
        for(Shape figure:myShapes){
            System.out.println(figure.getName()+" имеет площадь:"+figure.getArea(height, width));    
        }
        System.out.println(recTri.getName()+" имеет периметр:"+recTri.getPerimeter(height, width));
        System.out.println(ell.getName()+" имеет периметр:"+ell.getCircleLength(height, width));
        System.out.println("Сумма малого и большого радиусов:"+ell.getRadius(height, width));
        System.out.println("Длина окружности круга:"+ro.getCircleLength(height, width));
        System.out.println("Радиус круга:"+ro.getRadius(height, width));
    }  
}