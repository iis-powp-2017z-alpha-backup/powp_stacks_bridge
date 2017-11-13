package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;

public class Stack {
	// Stack is now using abstraction instead of concrete implementation. 
	
	private final StackImplementation items;
	
	public Stack(StackImplementation items) {
		this.items = items;
	}
	
	public Stack() {
		items = new StackArray();
	}
	
	public int getTotal() {
		return items.getTotal();
	}

	public void push(int i) {
		getItems().push(i);
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public boolean isFull() {
		return items.isFull();
	}

	public int top() {
		return getItems().top();
	}

	public int pop() {
		return getItems().pop();
	}

	private StackImplementation getItems() {
		return items;
	}
}
