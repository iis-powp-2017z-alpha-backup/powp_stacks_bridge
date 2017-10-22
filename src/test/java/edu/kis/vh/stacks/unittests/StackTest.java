package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;

public class StackTest {

	private static final int DEFAULT_TEST_VALUE = 4;
	private static final int EMPTY_STACK_VALUE = -1;
	private static final int STACK_CAPACITY = 12;

	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		stackObj.push(DEFAULT_TEST_VALUE);

		int result = stackObj.top();
		Assert.assertEquals(DEFAULT_TEST_VALUE, result);
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

		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		stackObj.push(DEFAULT_TEST_VALUE);

		result = stackObj.top();
		Assert.assertEquals(DEFAULT_TEST_VALUE, result);
		result = stackObj.top();
		Assert.assertEquals(DEFAULT_TEST_VALUE, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		stackObj.push(DEFAULT_TEST_VALUE);

		result = stackObj.pop();
		Assert.assertEquals(DEFAULT_TEST_VALUE, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
