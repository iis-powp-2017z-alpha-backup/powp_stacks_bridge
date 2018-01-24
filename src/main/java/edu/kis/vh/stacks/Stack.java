package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author Aliaksei
 *
 */
public class Stack {
	
	private StackList stackList;

	public boolean isEmpty() {
		return stackList.empty();
	}

	public boolean isFull() {
		return stackList.full();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}

	public Stack() {
		this.stackList = new StackList();
	}

	public Stack(StackArray stackArray) {
		super();
		this.stackList = new StackList();
	}

	public int getTotal() {
		return stackList.getTotal();
	}

	public void push(int i) {
		stackList.pushElement(i);
	}

}
