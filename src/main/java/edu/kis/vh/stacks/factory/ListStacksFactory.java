package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.implementations.StackList;

public class ListStacksFactory implements IstacksFactory {

	@Override
	public stack GetStandardStack() {
		return new stack(new StackList());
	}

	@Override
	public stack GetFalseStack() {
		return new stack();
	}

	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO(new StackList());
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi(new StackList());
	}

}
