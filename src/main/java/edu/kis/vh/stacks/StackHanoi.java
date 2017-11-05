package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	public StackHanoi() {
		super();
	}

	public StackHanoi(IStack stack) {
		super(stack);
	}

	private static final int TOTAL_REJECTED_INIT = 0;
	private int totalRejected = TOTAL_REJECTED_INIT;

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
