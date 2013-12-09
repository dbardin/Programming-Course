class Seal extends Wild implements IAnimals{
	
	private String Capacity;
	 
   Seal(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println("And the " + getName() + " goes - ow ow ow.");
	}
		
	protected	void property() {
			System.out.println(getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " walks and swims funny.");
		}
}

// 