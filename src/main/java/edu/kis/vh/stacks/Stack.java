package edu.kis.vh.stacks;

public class Stack {

	private static final int TOTAL_FULL = 11;
	private static final int TOTAL_EMPTY = -1;
	private static final int ITEMS_SIZE = 12;

	private int[] ITEMS = new int[ITEMS_SIZE];

	public int total = TOTAL_EMPTY;

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == TOTAL_EMPTY;
	}

	public boolean isFull() {
		return total == TOTAL_FULL;
	}

	public int top() {
		if (isEmpty())
			return TOTAL_EMPTY;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return TOTAL_EMPTY;
		return ITEMS[total--];
	}

}
