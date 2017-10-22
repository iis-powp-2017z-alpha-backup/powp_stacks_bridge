package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackHanoi extends stack {

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
