package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackArray {

	//private int[] ITEMS = new int[12];
	private StackList mArray = new StackList(); 

	//public int total = -1;

	public void push(int i) {
		if (!isFull())
			mArray.pushElement(i);
	}

	public boolean isEmpty() {
		return mArray.empty();
	}

	public boolean isFull() {
		return mArray.full();
	}

	public int top() {
		if (isEmpty())
			return -1;
		return mArray.peek();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		return mArray.pop();
	}

}
