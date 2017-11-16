package edu.kis.vh.stacks;

public class Stack {
	public Stack(int total, StackArray stackArray) {
		super();
		this.total = total;
		this.stackArray = stackArray;
	}
	
	public Stack(){
		this.stackArray = new StackArray();
	}

	final int EMPTY_STACK_VALUE = -1;
	final int FULL_STACK_VALUE = 11;

	private final int[] ITEMS = new int[12];	

	private int total = EMPTY_STACK_VALUE;
	
	private StackArray stackArray;

	public int getTotal() {
		return stackArray.getTotal();
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