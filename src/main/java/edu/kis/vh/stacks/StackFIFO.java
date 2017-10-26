package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackFIFO extends stack {

	private StackList mLocalStackList;

	public StackFIFO() {
		mLocalStackList = new StackList();
	}

	public StackFIFO(StackList mLocalStackList) {
		super();
		this.mLocalStackList = mLocalStackList;
	}

	@Override
	public int pop() {
		while (!isEmpty())

			mLocalStackList.pushElement(super.pop());

		int ret = mLocalStackList.pop();

		while (!mLocalStackList.empty())

			push(mLocalStackList.pop());

		return ret;
	}
}
