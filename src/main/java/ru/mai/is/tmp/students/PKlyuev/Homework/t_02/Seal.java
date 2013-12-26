package ru.mai.is.tmp.students.PKlyuev.t_02;

class Seal extends Wild{
	
	private String Capacity;
	 
	Seal(String quality) {
        this.Capacity = quality;
        }
	
	public void say() {
		System.out.println("And the seal goes - ow ow ow.");
		}
	
	protected void property() {
		System.out.println("Seal - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Seal walks and swims funny.");
		}
	}

// 