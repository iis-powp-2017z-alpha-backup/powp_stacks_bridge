package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.types.StackArray;
import edu.kis.vh.stacks.types.StackList;

public class StackArrayFactory implements IstacksFactory {

	@Override
	public Stack getStandardStack() {
		return new Stack(new StackArray());
	}

	@Override
	public Stack getFalseStack() {
		return new Stack(new StackList());
	}

	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
