package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collect.StackArray;

public class stack {

	private stackable stackArray = new StackArray();
	
	
	public stack(stackable stackArray) {
		super();
		this.stackArray = stackArray;
	}

	public stack() {
		// TODO Auto-generated constructor stub
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}

}
