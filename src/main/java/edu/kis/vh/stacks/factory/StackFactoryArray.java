package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackInterface;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.types.StackArray;
import edu.kis.vh.stacks.types.StackList;

public class StackFactoryArray implements IstacksFactory {

	@Override
	public stack GetStandardStack() {
		// TODO Auto-generated method stub
		return new stack(new StackArray());
	}

	@Override
	public stack GetFalseStack() {
		// TODO Auto-generated method stub
		return new stack(new StackList());
	}

	@Override
	public StackFIFO GetFIFOStack() {
		// TODO Auto-generated method stub
		return new StackFIFO();
	}

	@Override
	public StackHanoi GetHanoiStack() {
		// TODO Auto-generated method stub
		return new StackHanoi();
	}

}
