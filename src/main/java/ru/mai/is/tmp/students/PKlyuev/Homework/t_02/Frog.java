package ru.mai.is.tmp.students.PKlyuev.t_02;

class Frog extends Wild{
	private String Capacity;
	
	Frog(String quality) {
	   this.Capacity = quality;
	   }
	
	public	void say() {
		System.out.println("Frog goes - croak.");
		}
	
	protected void property() {
		System.out.println("Frog - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Frog is amphibious.");
		}
	}

// 