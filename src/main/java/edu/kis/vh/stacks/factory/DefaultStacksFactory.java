package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.BasicStackArray;
import edu.kis.vh.stacks.BasicStackImpl;
import edu.kis.vh.stacks.Stack;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements IstacksFactory {

	@Override
	public Stack GetStandardStack() {
		return new Stack(getStackImpl());
	}

	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi(this);
	}

	@Override
	public BasicStackImpl getStackImpl() {
		// TODO Auto-generated method stub
		 return new BasicStackArray();
	}

	@Override
	public Stack getStandardStack() {
		// TODO Auto-generated method stub
		 return new Stack(getStackImpl());
	}



	@Override
	public StackFIFO getFIFOStack() {
		// TODO Auto-generated method stub
		return new StackFIFO();	
	}

	@Override
	public Stack getFalseStack() {
		// TODO Auto-generated method stub
		return new Stack(getStackImpl());
	}

	@Override
	public Stack GetFalseStack() {
		// TODO Auto-generated method stub
		return null;
	}



}
