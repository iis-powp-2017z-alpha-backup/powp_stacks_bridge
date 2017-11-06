package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.basic.mechanisms.StackArray;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackListFactory implements StacksFactory {

	@Override
	public Stack getStandardStack() {
		// TODO Auto-generated method stub
		return new Stack(new StackList());
	}

	@Override
	public Stack getFalseStack() {
		// TODO Auto-generated method stub
		return new Stack(new StackArray());
	}

	@Override
	public StackFIFO getFIFOStack() {
		// TODO Auto-generated method stub
		return new StackFIFO(new StackList());
	}

	@Override
	public StackHanoi getHanoiStack() {
		// TODO Auto-generated method stub
		return new StackHanoi(new StackList());
	}

}
