package edu.kis.vh.stacks.list;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StackListTest {

	@Test
	public void testPushElement() {
		StackList stackListObj = new StackList();
		int testValue12 = 12;
		int testValue15 = 15;
		
		stackListObj.pushElement(testValue12);
		stackListObj.pushElement(testValue15);
		Assert.assertEquals(testValue15, stackListObj.pop());
		Assert.assertEquals(testValue12, stackListObj.pop());
	}

	@Test
	public void testEmpty() {
		StackList stackListObj = new StackList();
		assertTrue(stackListObj.empty());
	}

	@Test
	public void testFull() {
		StackList stackListObj = new StackList();
		
		assertFalse(stackListObj.full());
	}

	@Test
	public void testPeek() {
		StackList stackListObj = new StackList();
		int testValue12 = 12;
		int testValue15 = 15;
		
		stackListObj.pushElement(testValue12);
		stackListObj.pushElement(testValue15);
		Assert.assertEquals(testValue15, stackListObj.peek());
		Assert.assertEquals(testValue15, stackListObj.peek());
	}

	@Test
	public void testPop() {
		StackList stackListObj = new StackList();
		final int RETURN_NUMBER = -1;
		int testValue12 = 12;
		int testValue15 = 15;
		
		stackListObj.pushElement(testValue12);
		stackListObj.pushElement(testValue15);
		Assert.assertEquals(testValue15, stackListObj.pop());
		Assert.assertEquals(testValue12, stackListObj.pop());
		Assert.assertEquals(RETURN_NUMBER, stackListObj.pop());
	}

}
