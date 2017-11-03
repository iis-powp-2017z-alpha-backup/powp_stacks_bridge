package edu.kis.vh.stacks.unittests;

import org.junit.Test;

import edu.kis.vh.stacks.StackHanoi;
import junit.framework.Assert;

public class StackHanoiTest {

	@Test
	public void pushTest() {
		StackHanoi testObj = new StackHanoi();
		final int FIRST_HANOI_ELEMENT = 2;
		final int SECOND_HANOI_ELEMENT = 5;
		
		testObj.push(FIRST_HANOI_ELEMENT);
		Assert.assertEquals(testObj.top(), FIRST_HANOI_ELEMENT);
		
		testObj.push(SECOND_HANOI_ELEMENT);
		//Still top element should be value FIRST_HANOI_ELEMENT
		Assert.assertEquals(testObj.top(), FIRST_HANOI_ELEMENT);
		
	}

}
