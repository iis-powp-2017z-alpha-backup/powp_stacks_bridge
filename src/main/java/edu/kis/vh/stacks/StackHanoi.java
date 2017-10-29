package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private static final int TOTAL_REJECTED_INIT = 0;
	int totalRejected = TOTAL_REJECTED_INIT;

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
