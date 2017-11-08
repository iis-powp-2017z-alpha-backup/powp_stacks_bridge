package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stackRealization.StackArray;
import edu.kis.vh.stacks.stackRealization.StackList;

public class StackHanoi extends Stack {

	public StackHanoi() {
		super();
	}

	public StackHanoi(int nrOfElements) {
		super(nrOfElements);
	}

	public StackHanoi(StackArray stackArrray) {
		super(stackArrray);
	}

	public StackHanoi(StackList stackList) {
		super(stackList);
	}

	private int totalRejected = 0;

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
