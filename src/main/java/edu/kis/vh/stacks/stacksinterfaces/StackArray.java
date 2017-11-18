package edu.kis.vh.stacks.stacksinterfaces;

import edu.kis.vh.stacks.StacksInterface;

public class StackArray implements StacksInterface {
	
	private static final int NUMB_NNEXT = 11;
	private static final int TABLE_SIZE = 12;
	private final int[] ITEMS = new int[TABLE_SIZE];
	private int total = -1;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StacksInterface#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StacksInterface#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StacksInterface#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StacksInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == NUMB_NNEXT;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StacksInterface#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StacksInterface#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		return ITEMS[total--];
	}

}
