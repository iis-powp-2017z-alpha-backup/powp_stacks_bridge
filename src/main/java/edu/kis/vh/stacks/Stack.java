package edu.kis.vh.stacks;

public class Stack {

	private static final int twelve = 12;

	private static final int minusOne = -1;

	private int[] ITEMS = new int[twelve];

	private int total = minusOne;

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == minusOne;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return minusOne;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return minusOne;
		return ITEMS[total--];
	}

}
