package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackList;

public class StackFIFO extends Stack {

	private StackAL LocalStackList;

	public StackFIFO(int[] iTEMS, int total) {
		super(iTEMS, total);
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackAL LocalStack) {
		super(LocalStack);
		// TODO Auto-generated constructor stub
	}
	
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
		LocalStackList.push(i);
	}

	@Override
	public boolean isEmpty() {
		return LocalStackList.isEmpty();
	}

	@Override
	public boolean isFull() {
		return LocalStackList.isFull();
	}

	@Override
	public int top() {
		return LocalStackList.top();
	}
	
	
}