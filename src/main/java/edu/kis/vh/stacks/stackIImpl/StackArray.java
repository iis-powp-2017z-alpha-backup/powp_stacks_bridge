package edu.kis.vh.stacks.stackIImpl;

import edu.kis.vh.stacks.StackI;

public class StackArray implements StackI {

	private int[] ITEMS = new int[12];

	private static final int FULL = 11;
	private static final int EMPTY = -1;
	private int total = EMPTY;

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == FULL;
	}

	public int top() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total--];
	}

	public int getTotal() {
		return total;
	}

}
