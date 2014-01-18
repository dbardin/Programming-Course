package ru.mai.is.tmp.students.PKlyuev.t_02;

class Fish extends Wild{
	
	private String Capacity;
	 
	Fish(String quality) {
		this.Capacity = quality;
		}
	
	public void say() {
		System.out.println("And fish go - blub.");
		}
	
	protected void property() {
		System.out.println("Fish - Class: wild/domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Fish swims.");
		}
	}


// 