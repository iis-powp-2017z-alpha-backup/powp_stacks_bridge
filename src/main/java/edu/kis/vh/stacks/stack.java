package edu.kis.vh.stacks;

public class stack {

	private StackArray stackArray;

	public stack () {
		this.stackArray = new StackArray();
	}

	public stack(StackArray stackArray) {
		this.stackArray = stackArray;
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
