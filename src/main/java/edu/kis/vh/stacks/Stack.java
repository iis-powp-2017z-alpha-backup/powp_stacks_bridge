package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {

	private StackArray stackArray;
	private StackList stackList;

	public Stack() {
		this.stackList = new StackList();
		// this.stackArray = new StackArray();
	}

	public Stack(StackList stackList) {
		super();
		// this.stackArray = stackArray;
		this.stackList = stackList;
	}
	
	public int getTotal() {
		// return stackArray.getTotal();
		return stackList.getI();
	}

	public void push(int i) {
		// stackArray.push(i);
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		// return stackArray.isEmpty();
		return stackList.empty();
	}

	public boolean isFull() {
		// return stackArray.isFull();
		return stackList.full();
	}

	public int top() {
		// return stackArray.top();
		return stackList.peek();
	}

	public int pop() {
		// return stackArray.pop();
		return stackList.pop();
	}

}
