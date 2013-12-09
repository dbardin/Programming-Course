class Cat extends Domestic implements IAnimals{
	
	private String Capacity;
	 
	Cat(String string) {
        this.Capacity = string;
    }
	
	public  void say() {
		System.out.println(super.getName() + " goes - meow.");
	}
		
	@Override
	protected void property() {
		System.out.println(super.getName() + " - Class: domestic; Rating: " + Capacity);
	}
	
	public void Walk() {
		System.out.println(super.getName() + " will walk away.");
		}
}

