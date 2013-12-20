package t_02;
class Cow extends Domestic implements IAnimals{
	
	private String Capacity;
	 
    Cow(String string) {
        this.Capacity = string;
    }
	
	public	void say() {
		System.out.println(super.getName() + " goes - moo.");
	}
		
	protected void property() {
			System.out.println(super.getName() + " - Class: domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(super.getName() + " is being graze.");
		}
}

// 