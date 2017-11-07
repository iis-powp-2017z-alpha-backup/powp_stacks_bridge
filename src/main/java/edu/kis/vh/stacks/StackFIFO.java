package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackFIFO extends Stack {

	private StackList LocalStackList;

	public StackFIFO() {
		super();
		LocalStackList = new StackList();
	}

	public StackFIFO(StackList LocalStackList) {
		super();
		this.LocalStackList = LocalStackList;
	}

	@Override
	public int pop() {
		return LocalStackList.pop();
	}

	@Override
	public void push(int i) {
		LocalStackList.pushElement(i);
	}

	@Override
	public boolean isEmpty() {
		return LocalStackList.empty();
	}

	@Override
	public boolean isFull() {
		return LocalStackList.full();
	}

	@Override
	public int top() {
		return LocalStackList.peek();
	}
	
	
}