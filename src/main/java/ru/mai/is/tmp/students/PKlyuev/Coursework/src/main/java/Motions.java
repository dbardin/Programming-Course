package ru.mai.is.tmp.students.PKlyuev.Coursework.src.main.java

import java.util.Queue;

public class Motions {
	Insert Scan;
		
	public void Motion(String Order, String argument, Queue<String> tasks, 
			Queue<String> act, Queue<String> finish, int TEST) 
	{
		do 	{	
			if (TEST == 0) {
				Scan = new Insert();
				System.out.println();
				System.out.println("Insert changes (format: 1->2; 2->3) or finish the program.");	
				Scan.InsertScan();
				Order = Scan.insertion;	
				}
			
			if (("1->2".equals(Order))&&(! tasks.isEmpty())) {
				if (act.size()<3) {
					if (TEST == 1) {
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
					break; 
					} else {
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
					}
					} else {
						System.out.println("Action List is owerflowed, you need to complete at least 1 task.");			
						}
				} else { if ("2->3".equals(Order)&&(! act.isEmpty())) {
					if (TEST == 1) {
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
						break; 
						} else {
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
						}
					} else { if (Order.contains(argument)) {
						break;
						} else { 
							if ((tasks.isEmpty())&&("1->2".equals(Order))) { 
								System.out.println("ToDo list is empty.");
							} else { 
								if ((act.isEmpty())&&("2->3".equals(Order))) { 
									System.out.println("Acting list is empty.");
								} else {
									System.out.println("Undefined command, try one more time.");
									}
								}
							}
					}			
				} 	
			} while ((Order.contains(argument) == false));
		}
	}
