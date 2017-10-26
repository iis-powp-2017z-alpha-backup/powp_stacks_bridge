package edu.kis.vh.stacks;

public class stack {

	private StackIf mLocalStack;

	public stack() {
		mLocalStack = new StackArray();
	}

	public stack(StackIf mLocalStack) {
		super();
		this.mLocalStack = mLocalStack;
	}

	public void push(int i) {
		mLocalStack.push(i);
	}

	public boolean isEmpty() {
		return mLocalStack.isEmpty();
	}

	public boolean isFull() {
		return mLocalStack.isFull();
	}

	public int top() {
		return mLocalStack.top();
	}

	public int pop() {
		return mLocalStack.pop();
	}
	
	
				
}
