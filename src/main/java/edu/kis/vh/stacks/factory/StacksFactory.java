package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackInterface;

public interface StacksFactory {

	public StackInterface getStandardStack();

	public StackInterface getFalseStack();

	public StackInterface getFIFOStack();

	public StackInterface getHanoiStack();

}
