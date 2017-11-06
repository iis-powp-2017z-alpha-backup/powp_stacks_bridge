package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackFIFOTest {
	
	final int EMPTY_STACK_VALUE = 0;
	final int TEST_VALUE = 4, TEST_VALUE_2 = 5;

	@Test
	public void testPop() {
		StackFIFO stackObj = new StackFIFO(new StackList());
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		stackObj.push(TEST_VALUE);
		stackObj.push(TEST_VALUE_2);
		result = stackObj.pop();
		Assert.assertEquals(TEST_VALUE, result);
		result = stackObj.pop();
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testStackFIFO() {
		StackFIFO stackObj = new StackFIFO();
		Assert.assertNotNull(stackObj);
	}

	@Test
	public void testStackFIFOStackInterface() {
		StackFIFO stackObj = new StackFIFO(new StackList());
		Assert.assertNotNull(stackObj);
	}
}
