package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author Aliaksei
 *
 */
public class Stack implements InterStackFace {
	
	private StackList stackList;

	@Override
	public boolean isEmpty() {
		return stackList.empty();
	}

	@Override
	public boolean isFull() {
		return stackList.full();
	}

	@Override
	public int top() {
		return stackList.peek();
	}

	@Override
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

	@Override
	public void push(int i) {
		stackList.pushElement(i);
	}

}
