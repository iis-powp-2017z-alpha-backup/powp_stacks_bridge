package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;

/*
 * Błędy występowały w testach testTop i testPop => problem tkwił w wartosci stałej EMPTY_STACK_VALUE która wynosiła -1
 * Zmieniłem wadliwą wartosć na 0
 * Błąd ten wynikał z realizacji zadania powtawionego mi w punkcie 10
 */

public class stackTest {

	private static final int randomValue = 888;
	private static final int EMPTY_STACK_VALUE = 0;
	private static final int STACK_CAPACITY = 12;
	private static final int testValue = 4;

	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();
		Assert.assertEquals(true, result);

		stackObj.push(randomValue);

		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new Stack();
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();
			Assert.assertEquals(false, result);
			stackObj.push(randomValue);
		}

		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack();

		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		stackObj.push(testValue);

		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
