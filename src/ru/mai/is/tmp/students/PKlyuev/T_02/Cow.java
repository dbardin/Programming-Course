class Cow extends Domestic implements IAnimals{
	
	private String Capacity;
	 
    Cow(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println(getName() + " goes - moo.");
	}
		
	protected void property() {
			System.out.println(getName() + " - Class: domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " is being graze.");
		}
}

// 