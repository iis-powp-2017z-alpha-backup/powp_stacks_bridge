package edu.kis.vh.stacks;


/**
 * @author Piotr Nitecki 199111
 * 29.10.2017
 */
public class Stack {
	
	private StackArray stackArray = new StackArray();

	public Stack(int[] iTEMS, int total) {
		super();
		ITEMS = iTEMS;
		this.total = total;
	}
	
	
	public Stack()
	{}

	private static final int FULL_STUCK = 11;

	private static final int EMPTY_STACK = -1;

	private static final int TAB_SIZE = 12;

	private int[] ITEMS = new int[TAB_SIZE];

	private int total = -1;

	public int getTotal() {
		return total;
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


