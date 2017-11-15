package edu.kis.vh.stacks.methods;


public class StackArray implements IStackMethod {

	private static final int STACK_SIZE = 12;

	private final int[] items = new int[STACK_SIZE];

	private int total = EMPTY_STACK_INDICATOR;

	/**
	 *
	 * @return
	 */
	@Override
	public int getTotal() {
		return total;
	}
	
	/**
	 *
	 * @param 
	 */
	@Override
	public void push(int i) {
		if (!isFull()) {
			items[++total] = i;
		}
	}

	/**
	 *
	 * @return 
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}

	/**
	 *
	 * @return 
	 */
	@Override
	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	/**
	 *
	 * @return 
	 */
	@Override
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
	@Override
	public int pop() {
		if (isEmpty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return items[total--];
	}

}