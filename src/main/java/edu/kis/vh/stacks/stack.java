package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stackIImpl.StackArray;

public class Stack implements StackI {

	private StackI stack; // przekazanie w konstruktorze dowolnego obiektu
							// implementującego StackI

	public Stack(StackI stack) {
		this.stack = stack;
	}

	public Stack() {
		stack = new StackArray();
	}

	@Override
	public void push(int i) {
		stack.push(i);
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public boolean isFull() {
		return stack.isFull();
	}

	@Override
	public int pop() {
		return stack.pop();

	}

	@Override
	public int top() {
		return stack.top();
	}

}
