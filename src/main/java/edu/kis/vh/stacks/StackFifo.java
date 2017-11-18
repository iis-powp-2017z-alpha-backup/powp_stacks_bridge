package edu.kis.vh.stacks;

public class StackFifo extends Stack {

	private final Stack temp = new Stack();
	
	public StackFifo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFifo(StacksInterface stackInter) {
		super(stackInter);
		// TODO Auto-generated constructor stub
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
