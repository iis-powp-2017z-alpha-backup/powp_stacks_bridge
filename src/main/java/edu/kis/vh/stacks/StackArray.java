package edu.kis.vh.stacks;

public class StackArray implements InterStackFace {

	private static final int FULL = 11;

	private static final int TOTAL = -1;

	private int[] ITEMS = new int[12];

	private int total = TOTAL;

	public int getTotal() {
		return TOTAL;
	}

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	// Zle wciecia nizej byli poprawione
	public boolean isEmpty() {
		return total == TOTAL;
	}

	public boolean isFull() {
		return total == FULL;
	}

	public int top() {
		if (isEmpty())
			return TOTAL;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return TOTAL;
		return ITEMS[total--];
	}
}
