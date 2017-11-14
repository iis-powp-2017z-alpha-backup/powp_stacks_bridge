
package edu.kis.vh.stacks;


public class Stack {

	private static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;

	private StackArray stackArray;

	public Stack() {
		this(new StackArray());
	}

	public Stack(StackArray stackArray) {
		this.stackArray = stackArray;
	}

	/**
	 *
	 * @return 
	 */
	public int getTotal() {
		return stackArray.getTotal();
	}
	
	/**
	 *
	 * @param 
	 */
	public void push(int i) {
		stackArray.push(i);
	}

	/**
	 *
	 * @return 
	 */
	public boolean isEmpty() {
		return stackArray.getTotal() == EMPTY_STACK_INDICATOR;
	}

	/**
	 *
	 * @return 
	 */
	public boolean isFull() {
		return stackArray.getTotal() == STACK_SIZE - 1;
	}

	/**
	 *
	 * @return 
	 */
	public int top() {
		return stackArray.top();
	}

	/**
	 *
	 * @return 
	 */
	public int pop() {
		return stackArray.pop();
	}

}