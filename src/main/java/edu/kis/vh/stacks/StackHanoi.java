package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.Stack;

public class StackHanoi extends Stack {

	int totalRejected = 0;

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