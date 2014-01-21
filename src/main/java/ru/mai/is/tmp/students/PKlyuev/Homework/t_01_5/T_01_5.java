package ru.mai.is.tmp.students.PKlyuev.t_01_5;
public class T_01_5 {

	public static void main(String[] args) {
		
		int f0 = 0;
		int f1 = 1;
		System.out.println(f1);
		int x = 0;
		for (int n = 2; n < 11; n = n + 1) {
			System.out.println(f1+f0);
			x = f1+f0;
			f0 = f1;
			f1 = x;
		}

	}

}
