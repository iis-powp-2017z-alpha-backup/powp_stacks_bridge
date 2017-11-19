package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private Stack temp = new Stack();
	
	public StackFIFO() {
		super();
	}

	public StackFIFO(IStack stackArray) {
		super(stackArray);
	}
	
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
