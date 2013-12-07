package ru.mai.is.tmp.students.arybalko.Task_02;
/**
 * @author arybalko
 * 7-й по порядку
 */
public class DiningChair extends Chair implements Home {
	private int Lenght;
	public int getLenght(){
		return Lenght;
	}
	public void setLenght (int Lenght) {
	if (Lenght>80) {
		this.Lenght=Lenght;
		System.out.println("Длина "+getLenght()+"! Вам так удобно?");
	} else {
		this.Lenght=80;
		System.out.println("Пусть длина сиденья будет лучше "+getLenght()+". Я думаю, так будет комфортнее.");
	}
	}
	private int Widht;
	public int getWidht(){
		return Widht;
	}
	public void setWidht (int Widht) {
	if (Widht>70) {
		this.Widht=Widht;
		System.out.println("Ширина "+getWidht()+"! Вам так удобно?");
	} else {
		this.Widht=70;
		System.out.println("Пусть ширина будет лучше "+getLenght()+". Я думаю, так будет комфортнее.");
	}
	}
	private int LegsHeight;
	public int getLegsHeight(){
		return LegsHeight;
	}
	public void setLegsHeight (int LegsHeight) {
	if (LegsHeight>75) {
		this.LegsHeight=LegsHeight;
		System.out.println("Высота ножек стула "+getLegsHeight()+"! Вам так удобно?");
	} else {
		this.LegsHeight=75;
		System.out.println("Пусть высота ножек будет лучше "+getLegsHeight()+". Я думаю, так будет комфортнее.");
	}
	}
	private int BackHeight;
	public int getBackHeight(){
		return BackHeight;
	}
	public void setBackHeight (int BackHeight) {
	if (BackHeight>75) {
		this.BackHeight=BackHeight;
		System.out.println("Высота спинки стула"+getBackHeight()+"! Вам так удобно?");
	} else {
		this.BackHeight=75;
		System.out.println("Пусть высота спинки будет лучше "+getBackHeight()+". Я думаю, так будет комфортнее.");
	}
	}
	public void Creation(){
		int Height = getLegsHeight() + getBackHeight();
		String Type = ("Стул под обеденный стул");
		System.out.println ("Тип созданной мебели: "+Type);
		System.out.println ("Габариты (ДхШхВ): "+getLenght()+"x"+getWidht()+"x"+Height);
		System.out.println ("В том числе: Высота ножек: "+getLegsHeight()+" и высота спинки: "+getBackHeight());
	}
}
