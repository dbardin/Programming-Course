package ru.mai.is.tmp.students.PKlyuev.Canban;

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
	Queue<String> tasks = new LinkedList<String>();
	Queue<String> act = new LinkedList<String>();
	Queue<String> finish = new LinkedList<String>();
		
	
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
		
	
	// Motions
	String Order = null;
	do 	{	
		Scan = new Insert();
		System.out.println();
		System.out.println("Insert changes (format: 1->2; 2->3) or finish the program.");	
		Scan.InsertScan();
		Order = Scan.insertion;	
				
		if (("1->2".equals(Order))&&(! tasks.isEmpty())) {
			if (act.size()<3) {
			act.add(tasks.remove());
			System.out.println();
			System.out.println("ToDo List:");	
			System.out.println(tasks);			
			System.out.println();
			System.out.println("Action List:");	
			System.out.println(act);		
			System.out.println();
			System.out.println("Finish List:");	
			System.out.println(finish);	
			System.out.println();	
			} else {
				System.out.println("Action List is owerflowed, you need to complete at least 1 task.");			}
		} else { if ("2->3".equals(Order)&&(! act.isEmpty())) {
			finish.add(act.remove());
			System.out.println("ToDo List:");	
			System.out.println(tasks);			
			System.out.println();
			System.out.println("Action List:");	
			System.out.println(act);		
			System.out.println();
			System.out.println("Finish List:");	
			System.out.println(finish);	
			System.out.println();
		} else { if (Order.contains(argument)) {
			  break;
		  } else { 
			 if ((tasks.isEmpty())&&("1->2".equals(Order))) { System.out.println("ToDo list is empty.");
			 } else { 
				 if ((act.isEmpty())&&("2->3".equals(Order))) { System.out.println("Acting list is empty.");
				 } else { 
					 System.out.println("Undefined command, try one more time.");
				 }
		  }
		  }
			  }
		  } 	
	} while ((Order.contains(argument) == false));
	
	
	//  Finishing
	System.out.println();
	System.out.println("Goodbye!");	
	}
}