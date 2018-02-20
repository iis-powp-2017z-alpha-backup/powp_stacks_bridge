package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;

public class StackFIFOTest {
	
	@Test
	public void testPop() {
		StackFIFO stackFIFO = new StackFIFO();
		int testValue = 99;
		
		stackFIFO.push(testValue);

		Assert.assertEquals(testValue, stackFIFO.pop());	
	}

}
