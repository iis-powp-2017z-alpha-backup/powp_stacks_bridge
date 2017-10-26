package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackFIFO extends stack {

	private StackList mLocalStackList;

	public StackFIFO() {
		super();
		mLocalStackList = new StackList();
	}

	public StackFIFO(StackList mLocalStackList) {
		super();
		this.mLocalStackList = mLocalStackList;
	}

	@Override
	public int pop() {
		return mLocalStackList.pop();
	}

	@Override
	public void push(int i) {
		mLocalStackList.pushElement(i);
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
	
	
}
