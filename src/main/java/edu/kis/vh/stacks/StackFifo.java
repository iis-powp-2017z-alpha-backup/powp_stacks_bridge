package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stacksinterfaces.StackList;

public class StackFifo extends Stack {

	private final StackList temp = new StackList(); // in this situation class StackList is a better choice than StackArray
	
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
/*
 I think that class StackFifo breaks isolation rule because in this class we find an object that doesn't belong to any class that is connected in any way with StackFifo 
 */  
