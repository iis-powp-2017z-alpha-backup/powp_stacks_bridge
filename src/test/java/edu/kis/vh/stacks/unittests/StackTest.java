package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackTest {

	final int TEST_VALUE = 4;
	final int EMPTY_STACK_VALUE = 0;
	final int STACK_CAPACITY = 12;
	final int TEST_VALUE2 = 888;
	int result = 0;
	@Test
	public void testPush() {
		Stack stackObj = new Stack();
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
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(TEST_VALUE2);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack();
		result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		stackObj.push(TEST_VALUE);
		result = stackObj.top();
		Assert.assertEquals(TEST_VALUE, result);
		result = stackObj.top();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		stackObj.push(TEST_VALUE);
		result = stackObj.pop();
		Assert.assertEquals(TEST_VALUE, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testStackInterface() {
		Stack stackObj = new Stack(new StackList());
		Assert.assertNotNull(stackObj);
	}

	@Test
	public void testStack() {
		Stack stackObj = new Stack();
		Assert.assertNotNull(stackObj);
	}
}
