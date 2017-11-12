package edu.kis.vh.stacks;

public class Stack {

	private static final int NUMB_NNEXT = 11;

	private static final int TABLE_SIZE = 12;

	private final int[] ITEMS = new int[TABLE_SIZE];

	private int total = -1;
	//TODO: method getTotal isn't used in any way. Maybe it would be better to remove it.
	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == -1;
	}

	public boolean isFull() {
		return total == NUMB_NNEXT;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return -1;
		return ITEMS[total--];
	}

}
