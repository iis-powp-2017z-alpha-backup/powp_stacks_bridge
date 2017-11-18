package edu.kis.vh.stacks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StackFifoTest {

	@Test
	public void testPop() {
		final int EMPTY_STACK_VALUE = -1;
		StackFifo stackObj = new StackFifo();
		int testValue01 = 1;
		int testValue02 = 2;
		int result;
		
		stackObj.push(testValue01);
		stackObj.push(testValue02);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue01, result);
		result = stackObj.pop();
		Assert.assertEquals(testValue02, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
