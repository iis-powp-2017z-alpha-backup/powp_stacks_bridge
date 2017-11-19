package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackInterface;
import edu.kis.vh.stacks.types.StackArray;
import edu.kis.vh.stacks.types.StackList;

public class StackFactoryList implements IstacksFactory {

	@Override
	public StackInterface GetStandardStack() {
		// TODO Auto-generated method stub
		return new StackList();
	}

	@Override
	public StackInterface GetFalseStack() {
		// TODO Auto-generated method stub
		return new StackArray();
	}

	@Override
	public StackFIFO GetFIFOStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StackHanoi GetHanoiStack() {
		// TODO Auto-generated method stub
		return null;
	}

}
