package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {
	final int EMPTY_STACK_VALUE = -1;
	final int FULL_STACK_VALUE = 11;

	private final int[] ITEMS = new int[12];	

	private int total = EMPTY_STACK_VALUE;
	
	public int getTotal() {
		return total;
	}

	@Override
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}
	
	@Override
	public boolean isFull() {
		return total == FULL_STACK_VALUE;
	}
		
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total];
	}
			
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return ITEMS[total--];
	}
}

