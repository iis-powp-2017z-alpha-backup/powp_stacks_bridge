package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collect.*;

public class Stack {

	private Stackable stack; // Możliwość przekazania dowolnego obiektu implementującego Stackable

	public Stack(Stackable stack) {
		this.stack = stack;
	}

	public Stack() {
		stack = new StackArray();
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
