package ru.mai.is.tmp.students.nkormakov.Task02;

public class Engine extends Details implements Car{
	private int hp;
	public int gethp(){
		return hp;
	}
	public void sethp (int hp) {
	if (hp>450) {
		this.hp=hp;
		System.out.println("Быстро летим");
	} else {
		this.hp=96;
		System.out.println("Медленно, не летим");
	}
	}

	public void Creation() {
		
	}}