class Mouse extends Wild implements IAnimals{
	
	private String Capacity;
	 
   Mouse(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println("And " + getName() + " goes - squeek.");
	}
		
	protected	void property() {
			System.out.println(getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " is afraid of cat.");
		}
}

// 