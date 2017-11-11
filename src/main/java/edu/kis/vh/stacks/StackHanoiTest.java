package edu.kis.vh.stacks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StackHanoiTest {
	
	@Test
	public void testPush() {
		StackHanoi stackObj = new StackHanoi();
		int testValue01 = 1;
		int testValue10 = 10;
		int testValue15 = 15;
		int result;
		
		stackObj.push(testValue10);
		stackObj.push(testValue15);
		stackObj.push(testValue01);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue01, result);
		result = stackObj.pop();
		Assert.assertEquals(testValue10, result);
	}

	@Test
	public void testReportRejected() {
		StackHanoi stackObj = new StackHanoi();
		int testValue01 = 1;
		int testValue10 = 10;
		int testValue15 = 15;
		
		stackObj.push(testValue10);
		stackObj.push(testValue15);
		stackObj.push(testValue01);
		
		Assert.assertEquals(testValue01, stackObj.reportRejected());;
	}

}
