package ru.mai.is.tmp.students.PKlyuev.t_02;

class Mouse extends Wild{
	
	private String Capacity;
	 
	Mouse(String quality) {
        this.Capacity = quality;
        }
	
	public	void say() {
		System.out.println("And mouse goes - squeek.");
		}
	
	protected void property() {
		System.out.println("Mouse - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Mouse is afraid of cat.");
		}
	}

// 