package ru.mai.is.tmp.students.nkormakov.Task01;
public class Task5 {
	public static void main(String[] args) {
		int a=0; int b=1; int i=0;
		System.out.print ("Первые 10 чисел ряда Фибоначчи: ");
			while(i<5){
				System.out.print(a+" "+b+" ");
				i=i+1; a=a+b; b=a+b;
			}
	}
}