package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementation.StackList;


public class StackListFactory implements IstacksFactory {

	@Override
	public Stack GetStandardStack() {
		return new Stack(new Stack());
	}

	@Override
	public Stack GetFalseStack() {
		return new Stack();
	}

	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO(new StackList());
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi(new StackList());
	}

}