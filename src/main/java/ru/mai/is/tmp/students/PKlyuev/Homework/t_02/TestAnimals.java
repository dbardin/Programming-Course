package ru.mai.is.tmp.students.PKlyuev.t_02;
public class TestAnimals{
	
	public static void main(String[] args) {
		IAnimals Dog = new Dog("Very good");
		IAnimals Cat = new Cat("Cool");
		IAnimals Bird = new Bird("Bad");
		IAnimals Mouse = new Mouse("Bad");
		IAnimals Cow = new Cow("Useful");
		IAnimals Frog = new Frog("Bad");
		IAnimals Elephant = new Elephant("Norm");
		IAnimals Ducks = new Ducks("Norm");
		IAnimals Fish = new Fish("Norm");
		IAnimals Seal = new Seal("Funny");
		IAnimals Fox = new Fox("Beautiful");
		
		Dog.say();
		Cat.say();
		Bird.say();
		Mouse.say();
		Cow.say();
		Frog.say();
		Elephant.say();
		Ducks.say();
		Fish.say();
		Seal.say();
		Fox.say();
		
		System.out.println();
		
		((Domestic)Dog).property();
		((Domestic)Cow).property();
		((Wild)Fox).property();
		((Wild)Fish).property();
		((Domestic)Cat).property();
		
		System.out.println();
		
		Dog.Walk();
		Cat.Walk();
		Seal.Walk();
		Fox.Walk();
		}
	}
