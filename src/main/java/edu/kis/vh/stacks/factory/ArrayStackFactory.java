package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFifo;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stacksinterfaces.StackArray;
import edu.kis.vh.stacks.stacksinterfaces.StackList;

public class ArrayStackFactory implements IstacksFactory {

	@Override
	public Stack getStandardStack() {
		// TODO Auto-generated method stub
		return new Stack(new StackArray());
	}

	@Override
	public Stack getFalseStack() {
		// TODO Auto-generated method stub
		return new Stack(new StackList());
	}

	@Override
	public StackFifo getFifoStack() {
		// TODO Auto-generated method stub
		return new StackFifo();
	}

	@Override
	public StackHanoi getHanoiStack() {
		// TODO Auto-generated method stub
		return new StackHanoi();
	}

}
