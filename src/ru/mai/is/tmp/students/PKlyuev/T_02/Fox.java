class Fox extends Wild implements IAnimals{
	
	private String Capacity;
	 
   Fox(String string) {
        this.Capacity = string;
    }
	
	public void say() {
		System.out.println();
		System.out.println("What does the Fox say?");
		System.out.println();
		System.out.println("Gering-ding-ding-ding-dingeringeding!");
		System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
		System.out.println("Hatee-hatee-hatee-ho!");
		System.out.println("Joff-tchoff-tchoffo-tchoffo-tchoff!");
		System.out.println("Jacha-chacha-chacha-chow!");
		System.out.println("Fraka-kaka-kaka-kaka-kow!");
		System.out.println("JA-hee-ahee ha-hee!");
		System.out.println("A-oo-oo-oo-ooo!");
	}
		
	protected	void property() {
			System.out.println(getName() + " - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println(getName() + " walks somewhere deep in the woods.");
		}
}

//       