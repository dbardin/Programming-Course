abstract class Wild {
	private String name = this.getClass().getName();
	
	protected String getName() {		
		return name;
	}
	
	private String Capacity;
	 
    
    protected void property() {
    	System.out.println(name + " - Class: wild; Rating: " + Capacity);
    }
    
}
