package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;

public interface StacksFactory {

	public Stack getStandardStack();

	public Stack getFalseStack();

	public Stack getFIFOStack();

	public Stack getHanoiStack();

}
