package edu.kis.vh.stacks;

import java.util.Stack;

public class StackFIFO extends Stack {

	public Stack temp = new Stack();
	
	@Override
	public Object pop() {
		while (!isEmpty())
		
		temp.push(super.pop());
		
		Object ret = temp.pop();
		
		while (!temp.isEmpty())
	
		push(temp.pop());
		
		return ret;
	}
}
