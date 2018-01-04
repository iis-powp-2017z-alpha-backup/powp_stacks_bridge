package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackI;

public interface IstacksFactory {

	public StackI getStandardStack();

	public StackI getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
