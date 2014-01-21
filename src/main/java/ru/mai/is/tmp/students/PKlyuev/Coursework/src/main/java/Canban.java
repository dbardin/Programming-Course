package ru.mai.is.tmp.students.PKlyuev.Coursework.src.main.java

import java.util.LinkedList;
import java.util.Queue;

public class Canban {
	Insert Scan;
	Insert ScanNumb;
	
	public void startProg() {
		
		// Number of tasks
		ScanNumb = new Insert();
		System.out.println("Insert number of tasks.");	
		ScanNumb.InsertNumber();
		int number = ScanNumb.numb;	
		System.out.println();	
		System.out.println(number);	
		
		//	Queue
		Queue tasks = new LinkedList();
		Queue act = new LinkedList();
		Queue finish = new LinkedList();		
		
		//	Tasks
		Scan = new Insert();	
		System.out.println("Insert "+number+" task(-s).");	
		for (int i = 0; i < number; i++) {
			Scan.InsertScan();
			tasks.add(Scan.insertion);	
			}	
		System.out.println();	
		
		//	Print initial lists
		System.out.println("ToDo List:");	
		System.out.println(tasks);			
		System.out.println();	
	
		System.out.println("Action List:");	
		System.out.println(act);		
		System.out.println();
	
		System.out.println("Finish List:");	
		System.out.println(finish);	
		System.out.println();	
	
		// Insert "finish" argument
		String argument = null;
		Scan = new Insert();
		System.out.println("Insert finishing argument.");	
		Scan.InsertScan();
		argument = Scan.insertion;	
		System.out.println(argument);	
		
		String Order = null;
		final int TEST = 0;
	
		// Motions
		Motions desk = new Motions();	
		desk.Motion(Order, argument, tasks, act, finish, TEST);
				
		//  Finishing
		System.out.println();
		System.out.println("Goodbye!");	
		
	}
}
