package ru.mai.is.tmp.students.PKlyuev.t_02;

class Cat extends Domestic{
	
	private String Capacity;
	 
	Cat(String quality) {
        this.Capacity = quality;
        }
	
	public  void say() {
		System.out.println("Cat goes - meow.");
		}
		
	@Override
	protected void property() {
		System.out.println("Cat - Class: domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Cat will walk away.");
		}
	}