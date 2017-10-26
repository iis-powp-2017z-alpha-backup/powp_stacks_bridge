package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class StackFIFO extends stack {

	private StackIf mLocalStackList;

	public StackFIFO() {
		super();
		mLocalStackList = new StackList();
	}

	public StackFIFO(StackIf mLocalStack) {
		super(mLocalStack);
		mLocalStackList = new StackList();
	}

	@Override
	public int pop() {
		while (!isEmpty())
			mLocalStackList.push(super.pop());

		int ret = mLocalStackList.pop();

		while (!mLocalStackList.isEmpty())
			push(mLocalStackList.pop());
		return ret;
	}

}
