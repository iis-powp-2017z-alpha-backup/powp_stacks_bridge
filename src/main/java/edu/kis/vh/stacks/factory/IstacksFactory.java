package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

interface IstacksFactory {

	public Stack createStandardStack();
	
	public Stack createFalseStack();
	
	public StackFIFO createFIFOStack();
	
	public StackHanoi createHanoiStack();
	
}
