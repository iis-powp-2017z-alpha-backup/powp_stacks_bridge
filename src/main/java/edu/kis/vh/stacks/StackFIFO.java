package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackFIFO extends StackList {

	public StackList temp = new StackList();

	@Override
	public int pop() {
		while (!empty()) {
			temp.push(super.pop());
		}
		int ret = temp.pop();
		while (!temp.empty()) {
			push(temp.pop());
		}
		return ret;
	}
}
