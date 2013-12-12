package ru.mai.is.tmp.students.nkormakov.Task02;

public class Wheels extends Details implements Car{
	private int radius;
	public int getradius(){
		return radius;
	}
	public void setradius (int radius) {
	if (radius>20) {
		this.radius=radius;
		System.out.println("Высоко летим");
	} else {
		this.radius=18;
		System.out.println("Летим нормально");
	}
	}

	public void Creation() {
		
	}}