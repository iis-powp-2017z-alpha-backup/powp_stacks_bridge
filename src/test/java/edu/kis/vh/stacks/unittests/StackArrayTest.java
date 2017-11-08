package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.stackRealization.StackArray;

public class StackArrayTest {

	@Test 
	public void CTORTest(){
		final int INITIAL_MAX_STACK_SIZE = 12;
		StackArray testStackArray = new StackArray();
		Assert.assertEquals(testStackArray.getNrOfElements(), INITIAL_MAX_STACK_SIZE);
	}
	
	@Test
	public void paramCTORTest(){
		final int MAX_STACK_SIZE = 5;
		StackArray testStackArray = new StackArray(MAX_STACK_SIZE);
		Assert.assertEquals(testStackArray.getNrOfElements(), MAX_STACK_SIZE);
	}
	
	@Test 
	public void isEmptyTest(){
		StackArray testStackArray = new StackArray(0);
		Assert.assertEquals(testStackArray.isEmpty(), true);
	}
	
	@Test
	public void pushTest() {
		StackArray testStackArray = new StackArray(2);
		testStackArray.push(1);
		testStackArray.push(2);
		Assert.assertEquals(testStackArray.isFull(), true);
		//Can not be pushed
		testStackArray.push(3);	
		Assert.assertEquals(testStackArray.pop(), 2);	
	}
	
	@Test
	public void popTest(){
		StackArray testStackArray = new StackArray(2);
		testStackArray.push(1);
		testStackArray.push(2);
		testStackArray.pop();
		testStackArray.pop();
		Assert.assertEquals(testStackArray.isEmpty(), true);
	}
	
	@Test 
	public void topTest(){
		StackArray testStackArray = new StackArray(2);
		testStackArray.push(1);
		testStackArray.push(2);
		Assert.assertEquals(testStackArray.top(), 2);
		Assert.assertEquals(testStackArray.isFull(), true);	
	}
}
