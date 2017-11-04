package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(StackInterface stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top()) {
			totalRejected++;
		} else {
			super.push(in);
		}
	}

}
