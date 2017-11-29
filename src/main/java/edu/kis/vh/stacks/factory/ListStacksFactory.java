package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.collect.*;

public class ListStacksFactory implements StackFactory {

	@Override
	public Stack getStandardStack() {
		return new Stack(new StackList());
	}

	@Override
	public Stack getFalseStack() {
		return new Stack(new StackArray());
	}

}
