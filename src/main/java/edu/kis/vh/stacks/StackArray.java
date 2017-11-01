package edu.kis.vh.stacks;

//test 22.10.2017
/**
 * @author Bartłomiej Kubicki 199106
 *
 */
public class StackArray implements StackVector {

	private static final int EMPTYSTACK = -1;
	private static final int STACK_FULL = 12;

	private final int[] items = new int[STACK_FULL];
	private int total = EMPTYSTACK;

	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTYSTACK;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == STACK_FULL - 1;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTYSTACK;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackVector#pop()
	 */
	public int pop() {
		if (isEmpty())
			return EMPTYSTACK;
		return ITEMS[total--];
	}

}
