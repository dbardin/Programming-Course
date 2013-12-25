package ru.mai.is.tmp.students.dkatkov.Task01_5_Fibonachi;
public class Fib {
	public static void main (String[] args) {
		int n=1, a=1, b=1; //Задаются первые члены последовательности и число-счетчик
		while (n<10) { //Пока условие выполняется
			System.out.print(a+", "+b+", ");
			a=a+b;
			b=b+a;
			n=n+2; //Считает количество выведенных на экран чисел
		}
	}

}
