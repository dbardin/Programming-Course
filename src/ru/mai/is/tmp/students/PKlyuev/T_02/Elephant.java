class Elephant extends Wild implements IAnimals{
	
	private String Capacity;
	 
    Elephant(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println("And the " + getName() + " goes - toot.");
	}
		
	protected	void property() {
			System.out.println(getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " lives in Africa and India.");
		}
}

//