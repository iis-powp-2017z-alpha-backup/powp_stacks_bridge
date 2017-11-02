package edu.kis.vh.stacks.basic.mechanisms;

import edu.kis.vh.stacks.StackInterface;

public class StackArray implements StackInterface {

	final private int STACK_EMPTY = -1;
	final private int STACK_FULL = 11;

	private int[] items = new int[STACK_FULL + 1];
	private int total = STACK_EMPTY;

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	public boolean isFull() {
		return total == STACK_FULL;
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
