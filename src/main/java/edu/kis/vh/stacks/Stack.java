package edu.kis.vh.stacks;

public class Stack {
	private final StackArray items = new StackArray();

	// nie widze potrzeby generowania konstruktora
	
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

	private StackArray getItems() {
		return items;
	}
}
