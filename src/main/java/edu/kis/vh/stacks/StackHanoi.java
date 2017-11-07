package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackList;

public class StackHanoi extends Stack {

	private StackAL LocalStackList;
	
	 	int totalRejected = 0;
	 
	 	public StackHanoi() {
	 		super();
	 		LocalStackList = new StackList();
	 	}
	 
	 	public StackHanoi(StackAL LocalStackList) {
	 		super();
	 		this.LocalStackList = LocalStackList;
	 	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
			if (!isEmpty() && in > top())
				totalRejected++;
		else
			super.push(in);
			LocalStackList.push(in);
	}
	
	
}
