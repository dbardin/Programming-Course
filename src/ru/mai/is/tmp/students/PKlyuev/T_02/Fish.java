class Fish extends Wild implements IAnimals{
	
	private String Capacity;
	 
   Fish(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println("And "  + getName() + " go - blub.");
	}
		
	protected	void property() {
			System.out.println(getName() + " - Class: wild/domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " swims.");
		}
}


// 