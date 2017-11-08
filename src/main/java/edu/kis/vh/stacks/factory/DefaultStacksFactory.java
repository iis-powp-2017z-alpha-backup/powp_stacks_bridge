package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements IstacksFactory {

	@Override
	public Stack createStandardStack() {
		return new Stack();
	}

	@Override
	public Stack createFalseStack() {
		return new Stack();
	}

	@Override
	public StackFIFO createFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi createHanoiStack() {
		return new StackHanoi();
	}

}
