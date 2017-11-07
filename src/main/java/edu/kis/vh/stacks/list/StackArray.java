package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.StackAL;

public class StackArray implements StackAL {
	
	private static final int FULL_STUCK = 11;
	private static final int EMPTY_STACK = -1;
	private static final int TAB_SIZE = 12;
	private int[] ITEMS = new int[TAB_SIZE];
	public int total = -1;

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
		return total == EMPTY_STACK;
	}

	@Override
	public boolean isFull() {
		return total == FULL_STUCK;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return ITEMS[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		return ITEMS[total--];
	}

}


