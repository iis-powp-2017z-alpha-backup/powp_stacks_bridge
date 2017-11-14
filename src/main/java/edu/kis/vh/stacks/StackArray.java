package edu.kis.vh.stacks;

public class StackArray {

	private static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;
	
	private final int[] items = new int[STACK_SIZE];

	private int total = EMPTY_STACK_INDICATOR;

	/**
	 *
	 * @return
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 *
	 * @param 
	 */
	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
	}

	/**
	 *
	 * @return 
	 */
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	/**
	 *
	 * @return 
	 */
	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	/**
	 *
	 * @return
	 */
	public int top() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return items[total];
	}

	/**
	 *
	 * @return 
	 */
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return items[total--];
	}

}