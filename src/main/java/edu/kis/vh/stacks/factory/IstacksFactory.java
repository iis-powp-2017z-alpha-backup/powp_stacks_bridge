package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackI;

	public interface IstacksFactory {
	
		public StackI GetStandardStack();
		
		public StackI GetFalseStack();
		
		public StackFIFO GetFIFOStack();
		
		public StackHanoi GetHanoiStack();
		
	}
