package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collect.StackList;

public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
	}

	public StackFIFO(Stackable stackArray) {
		super(stackArray);
	}

	private StackList temp = new StackList();

	@Override
	public int pop() {
		while (!isEmpty())

			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())

			push(temp.pop());

		return ret;
	}
}
