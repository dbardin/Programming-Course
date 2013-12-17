package t_02;
class Bird extends Wild implements IAnimals{
	
	private String Capacity;
	 
    Bird(String string) {
        this.Capacity = string;
    }
	
	public void say() {
		System.out.println(super.getName() + " goes - tweet.");
	}
		
	protected	void property() {
			System.out.println(super.getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(super.getName() + " fly away.");
		}
}