package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackFIFOTest {

	@Test
	public void testPop() {
		StackFIFO stackObj = new StackFIFO(new StackList());
		final int EMPTY_STACK_VALUE = 0;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TEST_VALUE = 4, TEST_VALUE_2 = 5;
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
