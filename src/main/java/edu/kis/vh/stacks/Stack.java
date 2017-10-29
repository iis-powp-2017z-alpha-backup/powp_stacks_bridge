package edu.kis.vh.stacks;

//test 22.10.2017
/**
 * @author Bartłomiej Kubicki 199106
 *
 */
public class Stack {

	private static final int STACK_FULL = 11;

	private static final int EMPTYSTACK = -1;

	private static final int TABLESIZE = 12;

	private int[] ITEMS = new int[TABLESIZE];

	public int total = -1;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTYSTACK;
	}

	public boolean isFull() {
		return total == STACK_FULL;
	}

	public int top() {
		if (isEmpty())
			return EMPTYSTACK;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTYSTACK;
		return ITEMS[total--];
	}

}
