package ru.mai.is.tmp.students.PKlyuev.Coursework.src.test.java

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;
import static junit.framework.Assert.*;

public class CanbanTest{
	@Test
	public void testMain() throws Exception {
		Motions MotionTest = new Motions();
		Queue<String> tasks = new LinkedList<String>();
		Queue<String> act = new LinkedList<String>();
		Queue<String> finish = new LinkedList<String>();
		tasks.add("12");
		tasks.add("34");
		tasks.add("56");
		String[] orderTest = {"1->2","2->3","1->2","finish"};
		String expectedAct = "34";
		String expectedFin = "12";
		String argument = "finish";
		int TEST = 1;
		for (int i = 0; i < orderTest.length;i++) {
			String order = orderTest[i];
			MotionTest.Motion(order, argument, tasks, act, finish, TEST);
		}
		assertTrue(act.contains(expectedAct));
		assertTrue(finish.contains(expectedFin));
		}
}