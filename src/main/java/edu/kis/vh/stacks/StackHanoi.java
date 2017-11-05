package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.IstacksFactory;

public class StackHanoi extends Stack {

int totalRejected = 0;

	public int reportRejected() {
	return totalRejected;
	}
	 public StackHanoi(IstacksFactory factory) {
		 super(factory.getStackImpl());
	 
	 }
	public void push(int in) {
	if (!isEmpty() && in > top())
		totalRejected++;
		else
			super.push(in);
	}
}
