package main.java.ru.mai.is.tmp.students.example.threads;

public class Monitors {
	private long i1 = 0; 
	private long i2 = 0; 
	private Object lock1 = new Object(); 
	private Object lock2 = new Object(); 
	
	public void i1Increase() { 
		synchronized(lock1) { 
			i1++; 
		} 
	} 

	public void i2Increase() { 
		synchronized(lock2) { 
			i2++; 
		}
	 } 
}
