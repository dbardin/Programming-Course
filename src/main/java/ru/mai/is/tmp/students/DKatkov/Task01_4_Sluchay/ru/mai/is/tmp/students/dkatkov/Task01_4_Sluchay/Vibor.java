package ru.mai.is.tmp.students.dkatkov.Task01_4_Sluchay;
public class Vibor {
	public static void main (String[] args) {
		int n=256; //Задается число
		if (n>=0 & n<=1000) { //Условие, что число должно быть в промежутке [1:1000]
			if (n>=5 & n<=555) { //Если число попадает в промежуток [5:555]
				System.out.println("Да, число в интервале (5;555)");
			}
			else { //Если не попадает [5:555]
				System.out.println("Нет. число не попало в интервал (5;555)");
			}
		}
		else { //Есчли заданное число не попадает в промежутке [1:1000]
			System.out.println("Задано неверное число");
		}
	}

}
