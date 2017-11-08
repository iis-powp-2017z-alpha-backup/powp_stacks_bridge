package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFifo;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements IstacksFactory {

	@Override
	public Stack GetStandardStack() {
		return new Stack();
	}

	@Override
	public Stack GetFalseStack() {
		return new Stack();
	}

	@Override
	public StackFifo GetFIFOStack() {
		return new StackFifo();
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi();
	}

}
