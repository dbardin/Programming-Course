package ru.mai.is.tmp.students.dmyagkov.task02;
/**
 *Фигура 
 */
abstract class Shape {
     protected int Area;
     protected String name;
     public String getName(){
         return name;
      }
     public abstract double getArea(double a,double b);  
}