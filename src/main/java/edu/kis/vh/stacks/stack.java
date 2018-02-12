package edu.kis.vh.stacks;

public class Stack {

	private static final int STACK_EMPTY = -1;

	private static final int STACK_CAPACITY = 12;

	private int[] items = new int[STACK_CAPACITY];

	public int total = STACK_EMPTY;

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return STACK_EMPTY;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return STACK_EMPTY;
		return items[total--];
	}

}
