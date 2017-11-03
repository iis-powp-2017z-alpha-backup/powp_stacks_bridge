package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;

public class StackTest {

	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		int testValue = 4;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new Stack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack();
		final int EMPTYSTACK = 0;

		int result = stackObj.top();
		Assert.assertEquals(EMPTYSTACK, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();
		final int EMPTYSTACK = 0;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTYSTACK, result);

		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTYSTACK, result);
	}

	@Test
	public void testGetTotal() {
		Stack stackObj = new Stack();
		final int EMPTYSTACK = 0;
		int result = stackObj.getTotal();

		Assert.assertEquals(EMPTYSTACK, result);
		int pushValue = 4;
		stackObj.push(pushValue);
		int testValue = 1;
		result = stackObj.getTotal();
		
		Assert.assertEquals(testValue, result);
		stackObj.pop();
		result = stackObj.getTotal();

		Assert.assertEquals(EMPTYSTACK, result);
	}
}
