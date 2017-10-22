package edu.kis.vh.stacks;

public class stack {

	private StackInterface stackArray = new StackArray();

	public stack(StackInterface stackArray) { //przez utworzony obiekt będzie można przekazać dowolny obiekt implementujący interfejs StackInterface
		super();
		this.stackArray = stackArray;
	}

	public stack() {
		super();
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
