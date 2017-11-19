package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.StackInterface;

public class StackArray implements StackInterface {

	private static final int howMuchItems = 12;

	private static final int emptyStack = -1;

	private int[] ITEMS = new int[howMuchItems];

	private int total = emptyStack; // wewnątrz klasy nie zmieniono dostępu do atrybutu poprzez setter i getter.

	public int getTotal() {
		return total;
	}

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
			return emptyStack;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return emptyStack;
		return ITEMS[total--];
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
