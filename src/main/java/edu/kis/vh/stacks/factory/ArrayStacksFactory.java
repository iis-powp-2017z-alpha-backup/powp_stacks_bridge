package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stackRealization.StackArray;
import edu.kis.vh.stacks.stackRealization.StackList;

public class ArrayStacksFactory implements IstacksFactory {
	int nrOfElements = 15;
	
	public ArrayStacksFactory(){}
	
	public ArrayStacksFactory(int nrOfElements){
		this.nrOfElements = nrOfElements;
	}
	
	@Override
	public Stack createStandardStack() {
		return new Stack(new StackArray(nrOfElements));
	}

	@Override
	public Stack createFalseStack() {
		return new Stack(new StackList());
	}

	@Override
	public StackFIFO createFIFOStack() {
		return new StackFIFO(new StackArray(nrOfElements));
	}

	@Override
	public StackHanoi createHanoiStack() {
		return new StackHanoi(new StackArray(nrOfElements));
	}

}
