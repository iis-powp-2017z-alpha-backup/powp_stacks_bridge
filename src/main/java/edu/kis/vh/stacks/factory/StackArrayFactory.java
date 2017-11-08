package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementation.StackArray;
import edu.kis.vh.stacks.implementation.StackList;

public class StackArrayFactory implements IstacksFactory{

	@Override
	public Stack GetStandardStack() {
		return new Stack();
	}

	@Override
	public Stack GetFalseStack() {
		return new Stack(new StackList());
	}

	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO(new StackArray());
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi(new StackArray());
	}

}