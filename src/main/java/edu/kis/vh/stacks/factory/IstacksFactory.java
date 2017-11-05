package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.BasicStackImpl;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

	public interface IstacksFactory {
	
		public Stack GetStandardStack();
		
	//	public stack GetFalseStack();
		
		public StackFIFO GetFIFOStack();
		
		public StackHanoi GetHanoiStack();
		  BasicStackImpl getStackImpl();
		  Stack getStandardStack();
		  Stack getFalseStack();
		  StackFIFO getFIFOStack();
		//BasicStackImpl getStackImpl();
	}
