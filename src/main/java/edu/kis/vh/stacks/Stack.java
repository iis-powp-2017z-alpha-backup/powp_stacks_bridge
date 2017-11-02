package edu.kis.vh.stacks;

public class Stack {

	StackArray stackArray;

	public Stack() {
		super();
		this.stackArray = new StackArray();
	}

	public Stack(StackArray stackArray) {
		super();
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

	public int getTotal() {
		return stackArray.getTotal();
	}

	public void setTotal(int total) {
		stackArray.setTotal(total);
	}

}
