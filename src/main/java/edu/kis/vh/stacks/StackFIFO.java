package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.list.StackList;
import edu.kis.vh.stacks.collections.list.StackVector;

public class StackFIFO extends Stack {

	private final StackList temp = new StackList();

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackVector stackVector) {
		super(stackVector);
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

//StackList wydaje sie lepszym wyborem, bo nie ustalamy z gory rozmiaru stosu, a zasoby sa przydzielane dynamicznie  
