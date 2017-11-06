package edu.kis.vh.stacks.basic.mechanisms.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.basic.mechanisms.StackArray;

public class StackArrayTest {

	final int TEST_VALUE = 4;
	final int STACK_EMPTY = 0;
	int result = 0;

	@Test
	public void testPush() {
		StackArray stackArrayObj = new StackArray();
		stackArrayObj.push(TEST_VALUE);
		result = stackArrayObj.top();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testIsEmpty() {
		StackArray stackArrayObj = new StackArray();
		Assert.assertEquals(true, stackArrayObj.isEmpty());
	}

	@Test
	public void testIsFull() {
		StackArray stackArrayObj = new StackArray();
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		stackArrayObj.push(TEST_VALUE);
		Assert.assertEquals(true, stackArrayObj.isFull());
	}

	@Test
	public void testTop() {
		StackArray stackArrayObj = new StackArray();
		result = stackArrayObj.top();
		Assert.assertEquals(STACK_EMPTY, result);
		stackArrayObj.push(TEST_VALUE);
		result = stackArrayObj.top();
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testPop() {
		StackArray stackArrayObj = new StackArray();
		result = stackArrayObj.pop();
		Assert.assertEquals(STACK_EMPTY, result);
		stackArrayObj.push(TEST_VALUE);
		result = stackArrayObj.pop();
		Assert.assertEquals(TEST_VALUE, result);
	}

}
