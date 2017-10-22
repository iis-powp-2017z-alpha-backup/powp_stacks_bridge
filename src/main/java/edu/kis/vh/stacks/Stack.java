package edu.kis.vh.stacks;

public class Stack {

	final private int STACK_EMPTY = -1;
	final private int STACK_FULL = 11;
	
	private int[] ITEMS = new int[12]; 
	private int total = STACK_EMPTY;

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
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
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return STACK_EMPTY;
		return ITEMS[total--];
	}

}
