package ru.mai.is.tmp.students.PKlyuev.t_02;
class Mouse extends Wild implements IAnimals{
	
	private String Capacity;
	 
   Mouse(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println("And " + super.getName() + " goes - squeek.");
	}
		
	protected	void property() {
			System.out.println(super.getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(super.getName() + " is afraid of cat.");
		}
}

// 