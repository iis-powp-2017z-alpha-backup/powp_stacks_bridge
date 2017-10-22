package edu.kis.vh.stacks;

public class StackArray implements StackInterface {

	private int[] ITEMS = new int[12];

	public int total = -1;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == -1;
	}


	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == 11;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return -1;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return -1;
		return ITEMS[total--];
	}

}
