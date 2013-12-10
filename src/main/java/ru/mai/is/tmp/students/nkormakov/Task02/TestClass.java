package ru.mai.is.tmp.students.nkormakov.Task02;

public class TestClass {
	public static void main(String[] args){
		System.out.println("Cоздаем машину");
		System.out.println("Создаем двигатель");
		Engine dvigatel = new Engine();
		dvigatel.sethp(753);
		dvigatel.Creation();
		System.out.println("Создаем трансмиссию");
		Transmission transmissia = new Transmission();
		transmissia.Creation();
		System.out.println("Создаем колеса");
		Wheels kolesa = new Wheels();
		kolesa.setradius(100);
		kolesa.Creation();
		System.out.println("Создаем кузов");
		Body kuzov = new Body();
		kuzov.Creation();
		System.out.println("Создаем интерьер");
		Interior interier = new Interior();
		interier.Creation();
	}
}
