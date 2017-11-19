package edu.kis.vh.stacks;

public class stack {

	private StackArray stackList;
	

	public stack(StackArray stackArray) {
		super();
		this.stackList = stackArray;
	}

	public void push(int i) {
		stackList.push(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.top();
	}

	public int pop() {
		return stackList.pop();
	}
	
}
