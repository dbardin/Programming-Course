package ru.mai.is.tmp.students.PKlyuev.t_02;

class Bird extends Wild{
	
	private String Capacity;
	 
    Bird(String quality) {
        this.Capacity = quality;
        }
	
	public void say() {
		System.out.println("Bird goes - tweet.");
		}
	
	@Override
	protected void property() {
		System.out.println("Bird - Class: wild; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Bird will fly away.");
		}
	}