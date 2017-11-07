package edu.kis.vh.stacks;

public class StackArray {
	
	private static final int FULL_STUCK = 11;
	private static final int EMPTY_STACK = -1;
	private static final int TAB_SIZE = 12;
	private int[] ITEMS = new int[TAB_SIZE];
	public int total = -1;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK;
	}

	public boolean isFull() {
		return total == FULL_STUCK;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		return ITEMS[total--];
	}

}


