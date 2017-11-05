package edu.kis.vh.stacks.impl;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {

	private static final int TOTAL_FULL = 11;
	private static final int ITEMS_SIZE = 12;

	private final int[] ITEMS = new int[ITEMS_SIZE];

	private int total = IS_EMPTY;

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	@Override
	public boolean isEmpty() {
		return total == IS_EMPTY;
	}

	@Override
	public boolean isFull() {
		return total == TOTAL_FULL;
	}

	@Override
	public int top() {
		if (isEmpty())
			return IS_EMPTY;
		return ITEMS[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return IS_EMPTY;
		return ITEMS[total--];
	}
}
