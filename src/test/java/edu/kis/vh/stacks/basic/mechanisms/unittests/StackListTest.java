package edu.kis.vh.stacks.basic.mechanisms.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.basic.mechanisms.StackArray;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackListTest {

	final int TEST_VALUE = 4;
	final int STACK_EMPTY = 0;
	int result = 0;

	@Test
	public void testPush() {
		StackList stackListObj = new StackList();
		stackListObj.push(TEST_VALUE);
		result = stackListObj.top();
		Assert.assertEquals(TEST_VALUE, result);
		stackListObj.push(TEST_VALUE + 1);
		result = stackListObj.top();
		Assert.assertEquals(TEST_VALUE + 1, result);
	}

	@Test
	public void testIsEmpty() {
		StackList stackListObj = new StackList();
		Assert.assertEquals(true, stackListObj.isEmpty());
		stackListObj.push(TEST_VALUE);
		Assert.assertEquals(false, stackListObj.isEmpty());
	}

	@Test
	public void testIsFull() {
		StackList stackListObj = new StackList();
		stackListObj.push(TEST_VALUE);
		Assert.assertEquals(false, stackListObj.isFull());
	}

	@Test
	public void testPop() {
		StackList stackListObj = new StackList();
		result = stackListObj.pop();
		Assert.assertEquals(STACK_EMPTY, result);
		stackListObj.push(TEST_VALUE);
		result = stackListObj.pop();
		Assert.assertEquals(TEST_VALUE, result);
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

}
