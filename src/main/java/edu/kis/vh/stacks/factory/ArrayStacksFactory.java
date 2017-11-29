package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.collect.*;

public class ArrayStacksFactory implements StackFactory {

	@Override
	public Stack getStandardStack() {
		return new Stack(new StackArray());
	}

	@Override
	public Stack getFalseStack() {
		return new Stack(new StackList());
	}

}
