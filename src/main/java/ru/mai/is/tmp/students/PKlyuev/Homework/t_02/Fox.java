package ru.mai.is.tmp.students.PKlyuev.t_02;

class Fox extends Wild{
	
	private String Capacity;
	
	Fox(String quality) {
		this.Capacity = quality;
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
	
	@Override
	protected void property() {
		System.out.println("Fox - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Fox walks somewhere deep in the woods.");
		}
	}

//       