package ru.mai.is.tmp.students.PKlyuev.t_02;

class Dog extends Domestic{
	
	private String Capacity;
	 
    Dog(String quality) {
        this.Capacity = quality;
        }
	
	public	void say() {
		System.out.println("Dog goes - woof.");
		}
	
	@Override
	protected void property() {
		System.out.println("Dog - Class: domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Dog likes walking.");
		}
	}

// 
// 