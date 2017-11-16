package edu.kis.vh.stacks;

public class StackArray {
	final int EMPTY_STACK_VALUE = -1;
	final int FULL_STACK_VALUE = 11;

	private final int[] ITEMS = new int[12];	

	private int total = EMPTY_STACK_VALUE;
	
	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}
	
	public boolean isFull() {
		return total == FULL_STACK_VALUE;
	}
		
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total];
	}
			
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total--];
	}

}