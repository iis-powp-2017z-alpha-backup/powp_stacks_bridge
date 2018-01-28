package edu.kis.vh.stacks.unittests;
import org.junit.Assert;
import org.junit.Test;
import edu.kis.vh.stacks.StackFIFO;

public class StackFIFOTest {

	@Test
	public void testPoP() {
		
		StackFIFO stackObj = new StackFIFO();
		
		final int TEST_VALUE = 5;
		
		stackObj.push(TEST_VALUE);
		Assert.assertEquals(stackObj.pop(), TEST_VALUE);
	}

}