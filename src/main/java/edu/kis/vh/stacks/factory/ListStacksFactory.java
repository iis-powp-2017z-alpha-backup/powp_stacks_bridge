package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stackRealization.StackArray;
import edu.kis.vh.stacks.stackRealization.StackList;

public class ListStacksFactory implements IstacksFactory{
	
	int nrOfElements;
	
	public ListStacksFactory(){}
	
	public ListStacksFactory(int nrOfElements){
		this.nrOfElements = nrOfElements;
	}
	@Override
	public Stack createStandardStack() {
		return new Stack(new StackList());
	}

	@Override
	public Stack createFalseStack() {
		return new Stack(new StackArray(nrOfElements));
	}

	@Override
	public StackFIFO createFIFOStack() {
		return new StackFIFO(new StackList());
	}

	@Override
	public StackHanoi createHanoiStack() {
		return new StackHanoi(new StackList());
	}
}
