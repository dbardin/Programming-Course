package ru.mai.is.tmp.students.PKlyuev.Canban.Canban_maven;

import java.util.LinkedList;
import org.junit.framework.Assert;

import java.util.Queue;

public class TestCanban {

public void TeststartProg() {	
		
	int number = 5;
	
	//	Queue
	Queue<String> tasks = new LinkedList<String>();
	Queue<String> act = new LinkedList<String>();
	Queue<String> finish = new LinkedList<String>();
		
	//	Tasks
	tasks.add("12");
	tasks.add("34");
	tasks.add("56");
	tasks.add("78");
	tasks.add("910");
		
	// Insert "finish" argument
	String argument = "finish";
		
	
	// Motions
	String Order = "1->2";
					
		if (("1->2".equals(Order))&&(! tasks.isEmpty())) {
			if (act.size()<3) {
			act.add(tasks.remove());
			assertTrue("12".equals(act));
		    if ("2->3".equals(Order)&&(! act.isEmpty())) {
			finish.add(act.remove());
			assertTrue("12".equals(finish));
		
	}
			}
		}
}
}