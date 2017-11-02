package edu.kis.vh.stacks;

import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackFIFO extends StackList {

	public StackList temp = new StackList();

	@Override
	public int pop() {
		while (!isEmpty()) {
			temp.push(super.pop());
		}
		int ret = temp.pop();
		while (!temp.isEmpty()) {
			push(temp.pop());
		}
		return ret;
	}
}
