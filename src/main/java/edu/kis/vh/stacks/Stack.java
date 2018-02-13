package edu.kis.vh.stacks;

public class Stack {

	// moze byc przekazany obiekt implementujacy interfejs IStack 
	private IStack stack;
	
	public Stack(IStack stackArray) {
		super();
		this.stack = stackArray;
	}
	
	public Stack() {
		this.stack = new StackArray();
	}

	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}

}
