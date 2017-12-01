package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

public class StackFIFO extends Stack {

	public StackList temp = new StackList();
	
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
