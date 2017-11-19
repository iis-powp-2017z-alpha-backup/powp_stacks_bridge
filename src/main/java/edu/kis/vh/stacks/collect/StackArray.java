package edu.kis.vh.stacks.collect;

import edu.kis.vh.stacks.Stackable;

public class StackArray implements Stackable {

	private static final int COUNT = 11;

	private int[] ITEMS = new int[COUNT+1];

	private int total = EMPTY_VALUE;

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_VALUE;
	}

	public boolean isFull() {
		return total == COUNT;
	}

	public int getTotal() {
		return total;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_VALUE;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_VALUE;
		return ITEMS[total--];
	}

}
