package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;


public class Stack {

	private static final int STACK_SIZE = 12;
	public static final int EMPTY_STACK_INDICATOR = -1;

	private StackList stackList;

	public Stack() {
		this(new StackList());
	}

	public Stack(StackList stackList) {
		this.stackList = stackList;
	}

	/**
	 *
	 * @return 
	 */
	public int getTotal() {
		return stackList.getTotal();
	}
	
	/**
	 *
	 * @param 
	 */
	public void push(int i) {
		stackList.pushElement(i);
	}

	/**
	 *
	 * @return 
	 */
	public boolean isEmpty() {
		return stackList.empty();
	}

	/**
	 *
	 * @return 
	 */
	public boolean isFull() {
		return stackList.full();
	}

	/**
	 *
	 * @return 
	 */
	public int top() {
		return stackList.peek();
	}

	/**
	 *
	 * @return 
	 */
	public int pop() {
		return stackList.pop();
	}

}