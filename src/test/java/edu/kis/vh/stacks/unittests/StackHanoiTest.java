package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackHanoiTest {

	@Test
	public void testPush() {
		StackHanoi stackObj = new StackHanoi();
		final int TEST_VALUE = 4, TEST_VALUE_2 = 5;
		stackObj.push(TEST_VALUE);
		stackObj.push(TEST_VALUE_2);
				
		int result = stackObj.top();
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
		final int TEST_VALUE = 4, TEST_VALUE_2 = 5;
		stackObj.push(TEST_VALUE);
		stackObj.push(TEST_VALUE_2);
		
		int result = stackObj.reportRejected();
		Assert.assertEquals(1, result);
	}

}
