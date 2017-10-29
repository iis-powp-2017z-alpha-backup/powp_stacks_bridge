package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private static final int TOTAL_REJECTED = 0;
	int totalRejected = TOTAL_REJECTED;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
