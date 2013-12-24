package ru.mai.is.tmp.students.PKlyuev.Canban.Canban_maven;
import java.util.LinkedList;
import java.util.Queue;
import static junit.framework.Assert.*;

public class TestCanban{
	public static void main(String[] args){
		
	//	Queue
	Queue<String> tasks = new LinkedList<String>();
	Queue<String> act = new LinkedList<String>();
	Queue<String> finish = new LinkedList<String>();
		
	//	Tasks
	tasks.add("12");
	tasks.add("34");
	tasks.add("56");
    String[] order = {"1->2","2->3","1->2","finish"};
    String [] expectedAct = {"12","","34"};
    String [] expectedFin = {"","12"};
    
	// Insert "finish" argument
	String argument = "finish";
			
	// Motions
for (int i = 0; i < order.length;i++)				
	{
		do 	{					
	
		if (("1->2".equals(order[i]))&&(! tasks.isEmpty())) {
			if (act.size()<3) {
			act.add(tasks.remove());			
	assertTrue("Тест провален "+i, act.contains(expectedAct[i]));
			break;			
			} else {
				System.out.println("Action List is owerflowed, you need to complete at least 1 task.");			
				}
		} else { if ("2->3".equals(order[i])&&(! act.isEmpty())) {
			finish.add(act.remove());
	assertTrue("Тест провален "+i, finish.contains(expectedFin[i]));
			break;			
		} else { if ("finish".equals(order[i])) {
			  break;			  
		  } else { 
			 if ((tasks.isEmpty())&&("1->2".equals(order[i]))) { System.out.println("ToDo list is empty.");
			 } else { 
				 if ((act.isEmpty())&&("2->3".equals(order[i]))) { System.out.println("Acting list is empty.");
				 } else { 
					 System.out.println("Undefined command, try one more time.");
				 }
		  }
		  }
			  }
		  } 	
	} while ((order[i].contains(argument) == false));
	}
}
}