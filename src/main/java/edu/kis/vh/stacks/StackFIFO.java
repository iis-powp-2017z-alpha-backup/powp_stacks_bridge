package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
	}

	public StackFIFO(IStack stackArray) {
		super(stackArray);
	}

	private final Stack temp = new Stack();

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