class Ducks extends Domestic implements IAnimals{
	
	private String Capacity;
	 
   Ducks(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println(getName() + " say - quack.");
	}
		
	protected void property() {
			System.out.println(getName() + " - Class: domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " slow walking, can swim and fly.");
		}
}