/**
 * @author arybalko
 * Программа, высчитывающая первые 10 чисел ряда Фибоначчи
 * Task_01 Задача 5
 */
package ru.mai.is.tmp.students.arybalko.Task_01;
public class FibonacciNumbers {
	public static void main(String[] args) {
		int Unparitynum=1; //Нечетный номер п.п. (1,3,5,7,9)
		int paritynumber=1; //Четный номер п.п. (2,4,6,8,10)
		int counter=0; //Счетчик
		System.out.print ("Первые 10 чисел ряда Фибоначчи: ");
			while(counter<10){
				System.out.print(Unparitynum+" "+paritynumber+" ");
				counter=counter+2;
				Unparitynum=Unparitynum+paritynumber;
				paritynumber=Unparitynum+paritynumber;
			}
	}
}
