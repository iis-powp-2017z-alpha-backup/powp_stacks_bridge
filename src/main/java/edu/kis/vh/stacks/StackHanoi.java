package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class StackHanoi extends stack {

	int totalRejected = 0;

	public StackHanoi() {
		super(new StackList());
	}

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
