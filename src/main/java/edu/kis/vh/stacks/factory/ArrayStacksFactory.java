package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stackRealization.StackArray;
import edu.kis.vh.stacks.stackRealization.StackList;

public class ArrayStacksFactory implements IstacksFactory {

	@Override
	public Stack createStandardStack() {
		return new Stack(new StackArray());
	}

	@Override
	public Stack createFalseStack() {
		return new Stack(new StackList());
	}

	@Override
	public StackFIFO createFIFOStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StackHanoi createHanoiStack() {
		// TODO Auto-generated method stub
		return null;
	}

}
