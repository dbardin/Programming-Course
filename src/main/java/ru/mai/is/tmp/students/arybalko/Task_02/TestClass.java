/**
 * @author arybalko
 * 8-й по порядку
 * Тестовый класс
 * Вводим габариты в сантиметрах
 * Все "эталонные" размеры, используемые в инкапсуляции, снимал со своей домашней мебели
 */
package ru.mai.is.tmp.students.arybalko.Task_02;
public class TestClass {
	public static void main(String[] args){
		System.out.println("Cоздаем мебель для дома.");
		System.out.println("1. Обеденный стол:");
		DiningTable stol = new DiningTable();
		stol.setLenght(120); //Вводим длину
		stol.setWidht(80); //Вводим ширину
		stol.setHeight(70); //Вводим высоту
		stol.Creation();	
		System.out.println("2. Стул под обеденный стол:");
		DiningChair stul = new DiningChair();
		stul.setLenght(30); //Вводим длину
		stul.setWidht(60); //Вводим ширину
		stul.setLegsHeight(40); //Вводим высоту ножек
		stul.setBackHeight(50); //Вводим высоту сиденья
		stul.Creation();
		System.out.println("3. Журнальный столик:");
		CoffeeTable ctable = new CoffeeTable();
		ctable.setLenght(20); //Вводим длину
		ctable.setWidht(60); //Вводим ширину
		ctable.setHeight(50); //Вводим высоту
		ctable.Creation();
	}
}
