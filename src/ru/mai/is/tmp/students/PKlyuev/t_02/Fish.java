package t_02;
class Fish extends Wild implements IAnimals{
	
	private String Capacity;
	 
   Fish(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println("And "  + super.getName() + " go - blub.");
	}
		
	protected	void property() {
			System.out.println(super.getName() + " - Class: wild/domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(super.getName() + " swims.");
		}
}


// 