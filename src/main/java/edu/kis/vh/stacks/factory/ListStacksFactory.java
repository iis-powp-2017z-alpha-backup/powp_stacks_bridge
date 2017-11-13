package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementations.StackList;
import edu.kis.vh.stacks.implementations.StackArray;


public class ListStacksFactory implements IstacksFactory {

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
		return new StackFIFO();
	}

	@Override
	public StackHanoi getHanoiStack() {
		// TODO Auto-generated method stub
		return new StackHanoi();
	}

}
