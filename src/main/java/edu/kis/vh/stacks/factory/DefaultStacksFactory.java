package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.types.StackArray;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackInterface;

public class DefaultStacksFactory implements IstacksFactory {

	@Override
	public stack GetStandardStack() {
		return new stack();
	}

	@Override
	public stack GetFalseStack() {
		return new stack();
	}

	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi();
	}

}
