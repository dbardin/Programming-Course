class Dog extends Domestic implements IAnimals{
	
	private String Capacity;
	 
    Dog(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println(getName() + " goes - woof.");
	}
		
	protected void property() {
			System.out.println(getName() + " - Class: domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " likes walking.");
		}
}

// 
// 