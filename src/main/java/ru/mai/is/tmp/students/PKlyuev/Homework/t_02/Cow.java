package ru.mai.is.tmp.students.PKlyuev.t_02;

class Cow extends Domestic{
	
	private String Capacity;
	 
    Cow(String quality) {
        this.Capacity = quality;
        }
	
	public	void say() {
		System.out.println("Cow goes - moo.");
		}
	
	@Override
	protected void property() {
		System.out.println("Cow - Class: domestic; Rating: " + Capacity);
		}
	
	public void Walk() {
		System.out.println("Cow is being graze.");
		}
	}

// 