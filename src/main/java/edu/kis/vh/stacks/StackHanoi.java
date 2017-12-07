package edu.kis.vh.stacks;

public class StackHanoi extends stack {

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(StackInterface stackArray) {
		super(stackArray);
		// TODO Auto-generated constructor stub
	}

	int totalRejected = 0;

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
