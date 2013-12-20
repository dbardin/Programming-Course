package ru.mai.is.tmp.students.PKlyuev.t_02;
class Frog extends Wild implements IAnimals{
	
	private String Capacity;
	 
   Frog(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println(super.getName() + " goes - croak.");
	}
		
	protected	void property() {
			System.out.println(super.getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(super.getName() + " is amphibious.");
		}
}

// 