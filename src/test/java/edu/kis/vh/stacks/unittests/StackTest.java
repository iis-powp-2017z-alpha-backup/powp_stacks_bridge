package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackArray;

public class StackTest {

	private static final int DEFAULT_TEST_VALUE = 4;
	private static final int EMPTY_STACK_VALUE = -1;
	private static final int STACK_CAPACITY = 12;

	@Test
	public void testPush() {
		StackArray stackObj = new StackArray();
		stackObj.push(DEFAULT_TEST_VALUE);

		int result = stackObj.top();
		Assert.assertEquals(DEFAULT_TEST_VALUE, result);
	}

	@Test
	public void testIsEmpty() {
		StackArray stackObj = new StackArray();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(888);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		StackArray stackObj = new StackArray();
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
		StackArray stackObj = new StackArray();

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
		StackArray stackObj = new StackArray();

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		stackObj.push(DEFAULT_TEST_VALUE);

		result = stackObj.pop();
		Assert.assertEquals(DEFAULT_TEST_VALUE, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
