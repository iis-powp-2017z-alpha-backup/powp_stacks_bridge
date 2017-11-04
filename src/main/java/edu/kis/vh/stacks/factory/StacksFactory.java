package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackInterface;

public interface StacksFactory {

	public StackInterface getStandardStack();

	public StackInterface getFalseStack();

	public StackInterface getFIFOStack();

	public StackInterface getHanoiStack();

}
