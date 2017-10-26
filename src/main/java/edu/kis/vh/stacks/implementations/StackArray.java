package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.StackIf;

public class StackArray implements StackIf {

	private int[] ITEMS = new int[12];

	public int total = -1;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackIf#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackIf#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == -1;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackIf#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == 11;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackIf#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackIf#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		return ITEMS[total--];
	}

}
