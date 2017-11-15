package edu.kis.vh.stacks;

import edu.kis.vh.stacks.methods.IStackMethod;
import edu.kis.vh.stacks.methods.StackList;

public class Stack {

	private static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;

	private IStackMethod stackItems;

	public Stack() {
		this(new StackList());
	}

	public Stack(IStackMethod stackItems) {
		this.stackItems = stackItems;
	}

	/**
	 *
	 * @return 
	 */
	public int getTotal() {
		return stackItems.getTotal();
	}
	
	/**
	 *
	 * @param 
	 */
	public void push(int i) {
		stackItems.push(i);
	}

	/**
	 *
	 * @return 
	 */
	public boolean isEmpty() {
		return stackItems.isEmpty();
	}

	/**
	 *
	 * @return 
	 */
	public boolean isFull() {
		return stackItems.isFull();
	}

	/**
	 *
	 * @return 
	 */
	public int top() {
		return stackItems.top();
	}

	/**
	 *
	 * @return 
	 */
	public int pop() {
		return stackItems.pop();
	}

}