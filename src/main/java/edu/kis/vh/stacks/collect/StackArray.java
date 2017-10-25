package edu.kis.vh.stacks.collect;

import edu.kis.vh.stacks.Stackable;

public class StackArray implements Stackable {

	private static final int FULL = 11;

	private static final int EMPTY = -1;

	private int[] ITEMS = new int[12];

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

	public int getTotal() {
		return total;
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

}
