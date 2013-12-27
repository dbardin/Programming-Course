package ru.mai.is.tmp.students.PKlyuev.t_01_4;
public class T_01_4 {

	public static void main(String[] args) {
		
		int n = (int)(0 + Math.random() * 1001);
		if ((n<555) && (n>5)) {
			
			System.out.print("Number " + n + " belongs to interval (5;555).");
			
		} else {
			
			System.out.print("Number " + n + " doesn't belong to interval (5;555).");
		}
	}

}
