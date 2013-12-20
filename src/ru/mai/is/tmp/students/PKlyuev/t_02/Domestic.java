package t_02;
abstract class Domestic {
	private String name = this.getClass().getName();
	
	protected String getName() {		
		return name;
	}
	
	protected String Capacity;
	
    
   protected void property() {
    	System.out.println(getName() + " - Class: domestic; Rating: " + Capacity);
    }
    
}