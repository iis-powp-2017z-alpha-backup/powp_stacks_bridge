package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	public StackHanoi() {
		super();
	}

	public StackHanoi(Stackable stackArray) {
		super(stackArray);
	}

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
