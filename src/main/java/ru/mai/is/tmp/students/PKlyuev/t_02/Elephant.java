package ru.mai.is.tmp.students.PKlyuev.t_02;
class Elephant extends Wild implements IAnimals{
	
	private String Capacity;
	 
    Elephant(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println("And the " + super.getName() + " goes - toot.");
	}
		
	protected	void property() {
			System.out.println(super.getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(super.getName() + " lives in Africa and India.");
		}
}

//