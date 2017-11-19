package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.StackIf;

/*
 * Klawisze alt + strzałka pozwalają się przemieszczać między plikami
 */

public class StackArray implements StackIf {

	private static final int stackMinimumValue = -1;
	private static final int stackCapacity = 12;
	private int[] ITEMS = new int[stackCapacity];
	private int total = stackMinimumValue;

	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	@Override
	public boolean isEmpty() {
		return total == stackMinimumValue;
	}

	@Override
	public boolean isFull() {
		return total == (stackCapacity - 1);
	}

	@Override
	public int top() {
		if (isEmpty())
			return errorCode;
		return ITEMS[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return errorCode;
		return ITEMS[total--];
	}

}
