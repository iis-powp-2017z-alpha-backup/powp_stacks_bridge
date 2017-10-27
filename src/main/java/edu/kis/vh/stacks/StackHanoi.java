package edu.kis.vh.stacks;

public class StackHanoi extends stack {
	int totalRejected;

	public StackHanoi() {
		super();
		totalRejected = 0;
	}

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
