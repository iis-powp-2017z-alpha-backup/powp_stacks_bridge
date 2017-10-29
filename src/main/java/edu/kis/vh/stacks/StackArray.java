package edu.kis.vh.stacks;

class StackArray {

	final private int STACK_EMPTY = -1;
	final private int STACK_FULL = 11;

	private int[] items;
	private int total;

	public StackArray() {
		super();
		this.items = new int[STACK_FULL + 1];
		this.total = STACK_EMPTY;
	}

	public StackArray(int[] items, int total) {
		super();
		this.items = items;
		this.total = total;
	}

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	public boolean isFull() {
		return total == STACK_FULL;
	}

	public int top() {
		if (isEmpty())
			return STACK_EMPTY;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return STACK_EMPTY;
		return items[total--];
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
