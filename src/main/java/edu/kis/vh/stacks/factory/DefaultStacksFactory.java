package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackInterface;
import edu.kis.vh.stacks.basic.mechanisms.StackArray;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class DefaultStacksFactory implements StacksFactory {

	@Override
	public StackInterface getStandardStack() {
		return new Stack(new StackArray());
	}

	@Override
	public StackInterface getFalseStack() {
		return new Stack(new StackList());
	}

	@Override
	public StackInterface getFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackInterface getHanoiStack() {
		return new StackHanoi();
	}

}
