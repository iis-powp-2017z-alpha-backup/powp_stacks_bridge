package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;

public class StackTest {

	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		final int TEST_VALUE = 4;
		stackObj.push(TEST_VALUE);

		int result = stackObj.top();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);
		final int TEST_VALUE = 888;
		stackObj.push(TEST_VALUE);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new Stack();
		final int STACK_CAPACITY = 12;
		final int TEST_VALUE = 888;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(TEST_VALUE);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = 0;

		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TEST_VALUE = 4;
		stackObj.push(TEST_VALUE);

		result = stackObj.top();
		Assert.assertEquals(TEST_VALUE, result);
		result = stackObj.top();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = 0;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TEST_VALUE = 4;
		stackObj.push(TEST_VALUE);

		result = stackObj.pop();
		Assert.assertEquals(TEST_VALUE, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
