package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackHanoi extends stack {

	private StackList mLocalStackList;
	int totalRejected = 0;

	public StackHanoi() {
		super();
		mLocalStackList = new StackList();
	}

	public StackHanoi(StackList mLocalStackList) {
		super();
		this.mLocalStackList = mLocalStackList;
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			mLocalStackList.pushElement(in);
	}

	@Override
	public boolean isEmpty() {
		return mLocalStackList.empty();
	}

	@Override
	public boolean isFull() {
		return mLocalStackList.full();
	}

	@Override
	public int top() {
		return mLocalStackList.peek();
	}

	@Override
	public int pop() {
		return mLocalStackList.pop();
	}
	
	
}
