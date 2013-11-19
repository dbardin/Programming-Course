/**
 * @author arybalko
 * Программа, высчитывающая первые 10 чисел Фибоначчи
 * Task_01 Задача 5
 */
public class Fibonacci {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int i=0;
		System.out.print ("Первые 10 чисел ряда Фибоначчи: ");
			while(i<10){
				System.out.print(a+" "+b+" ");
				i=i+2;
				a=a+b;
				b=a+b;
			}
	}
}