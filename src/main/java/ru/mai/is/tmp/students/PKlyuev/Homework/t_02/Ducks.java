package ru.mai.is.tmp.students.PKlyuev.t_02;

class Ducks extends Domestic{
	
	private String Capacity;
	 
	Ducks(String quality) {
	   this.Capacity = quality;
	   }
	
	public void say() {
		System.out.println("Duck say - quack.");
		}
		
	@Override
	protected void property() {
		System.out.println("Duck - Class: domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Duck slow walking, can swim and fly.");
		}
	}