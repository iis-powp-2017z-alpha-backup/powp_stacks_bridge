package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class StackHanoi extends stack {

	private StackIf mLocalStackList;
	int totalRejected = 0;

	public StackHanoi() {
		super();
		mLocalStackList = new StackList();
	}

	public StackHanoi(StackIf mLocalStackList) {
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
			mLocalStackList.push(in);
	}

	@Override
	public boolean isEmpty() {
		return mLocalStackList.isEmpty();
	}

	@Override
	public boolean isFull() {
		return mLocalStackList.isFull();
	}

	@Override
	public int top() {
		return mLocalStackList.top();
	}

	@Override
	public int pop() {
		return mLocalStackList.pop();
	}
	
	
}
