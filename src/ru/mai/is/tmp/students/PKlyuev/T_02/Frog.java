class Frog extends Wild implements IAnimals{
	
	private String Capacity;
	 
   Frog(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println(getName() + " goes - croak.");
	}
		
	protected	void property() {
			System.out.println(getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " is amphibious.");
		}
}

// 