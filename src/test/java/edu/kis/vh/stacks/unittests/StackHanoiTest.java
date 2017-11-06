package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackHanoiTest {

	final int TEST_VALUE = 4, TEST_VALUE_2 = 5;
	int result = 0;
	
	@Test
	public void testPush() {
		StackHanoi stackObj = new StackHanoi();
		stackObj.push(TEST_VALUE);
		stackObj.push(TEST_VALUE_2);
				
		result = stackObj.top();
		System.out.println(result);
		Assert.assertEquals(TEST_VALUE, result);
	}

	@Test
	public void testStackHanoi() {
		StackHanoi stackObj = new StackHanoi();
		Assert.assertNotNull(stackObj);
	}

	@Test
	public void testStackHanoiStackInterface() {
		StackHanoi stackObj = new StackHanoi(new StackList());
		Assert.assertNotNull(stackObj);
	}

	@Test
	public void testReportRejected() {
		StackHanoi stackObj = new StackHanoi();
		stackObj.push(TEST_VALUE);
		stackObj.push(TEST_VALUE_2);
		
		result = stackObj.reportRejected();
		Assert.assertEquals(1, result);
	}

}
