package ru.mai.is.tmp.students.PKlyuev.t_02;

class Elephant extends Wild{
	
	private String Capacity;
	 
    Elephant(String quality) {
    	this.Capacity = quality;
    	}
	
	public void say() {
		System.out.println("And the elephant goes - toot.");
		}
		
	@Override
	protected void property() {
		System.out.println("Elephant - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Elephant lives in Africa and India.");
		}
	}

//