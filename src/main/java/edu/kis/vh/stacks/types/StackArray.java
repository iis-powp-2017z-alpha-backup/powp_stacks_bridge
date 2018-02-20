package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {

	private static final int STACK_CAPACITY = 12;

	private final int[] items = new int[STACK_CAPACITY];

	private int total = STACK_EMPTY;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
			items[total++] = i;
	}

	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	public boolean isFull() {
		return total == STACK_CAPACITY;
	}

	public int top() {
		if (isEmpty())
			return STACK_EMPTY;
		return items[total-1];
	}

	public int pop() {
		if (isEmpty())
			return STACK_EMPTY;
		return items[--total];
	}

}
