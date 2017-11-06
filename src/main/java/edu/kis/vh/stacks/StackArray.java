package edu.kis.vh.stacks;

public class StackArray {
	private static final int INITIAL_MAX_STACK_SIZE = 12;

	private static final int STACK_INTERATOR_EMPTY_STACK = -1;

	private int[] ITEMS = new int[INITIAL_MAX_STACK_SIZE];	

	private int total = STACK_INTERATOR_EMPTY_STACK;
	
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}
	
	public boolean isEmpty() {
		return total == STACK_INTERATOR_EMPTY_STACK;
	}
		
	public boolean isFull() {
		return total == 11;
	}
			
	public int top() {
		if (isEmpty())
			return STACK_INTERATOR_EMPTY_STACK;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return STACK_INTERATOR_EMPTY_STACK;
		return ITEMS[total--];
	}

}
