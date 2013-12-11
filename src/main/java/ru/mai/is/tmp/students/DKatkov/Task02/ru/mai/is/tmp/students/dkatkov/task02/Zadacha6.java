package ru.mai.is.tmp.students.dkatkov.task02;


import java.util.Scanner;

public class Zadacha6 {
    
    private static double width;
    private static double height;
    
     public static void main(String[] args) {
         
         Scanner scn=new Scanner(System.in);
         
         System.out.println("Введите высоту прямоугольника,куда будут вписаны фигуры");
             height=scn.nextDouble();
             
         System.out.println("Введите ширину прямоугольника,куда будут вписаны фигуры");
             width=scn.nextDouble();
             
      Zadacha5 [] myShapes= new Zadacha5[4];
      
      Zadacha3 rec= new Zadacha3(); 
      
      myShapes[0]=rec;
      
      Zadacha7 sqrt=new Zadacha7();
      
      myShapes[1]=sqrt;
      
      Zadacha2 e=new Zadacha2();
      
      myShapes[2]=e;
      
      Zadacha4 r=new Zadacha4();
      
      myShapes[3]=r;
      
      for(Zadacha5 figure:myShapes){
          
          System.out.println(figure.getName()+" имеет площадь:"+figure.getArea(height, width));    
         }
      
      System.out.println(rec.getName()+" имеет периметр:"+rec.getPerimetr(height, width));
      
      System.out.println(e.getName()+" имеет периметр:"+e.getCircleLength(height, width));
      
      System.out.println("Сумма малого и большого радиусов:"+e.getRadius(height, width));
      
      System.out.println("Длина окружности круга:"+r.getCircleLength(height, width));
      
      System.out.println("Радиус круга:"+r.getRadius(height, width));
    }  
}
