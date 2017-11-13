package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.StackImplementation;

public class StackArray implements StackImplementation {
	private static final int FULL_STACK_VALUE = 11;

	private static final int STACK_SIZE = 12;

	private static final int EMPTY_STACK_VALUE = -1;

	private final int[] items = new int[STACK_SIZE];

	private int total = EMPTY_STACK_VALUE;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementation#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementation#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			getItems()[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementation#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementation#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == FULL_STACK_VALUE;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementation#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return getItems()[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementation#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return getItems()[total--];
	}

	private int[] getItems() {
		return items;
	}
}
