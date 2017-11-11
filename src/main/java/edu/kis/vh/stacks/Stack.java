package edu.kis.vh.stacks;

public class Stack {

	private StackArray stackArray = new StackArray();
	
	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}
	
	public Stack() {
		
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
				
}
