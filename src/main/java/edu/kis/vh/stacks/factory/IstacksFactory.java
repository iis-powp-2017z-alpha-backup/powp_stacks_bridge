package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackAL;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public interface IstacksFactory {

	public StackAL GetStandardStack();

	public StackAL GetFalseStack();

	public StackFIFO GetFIFOStack();

	public StackHanoi GetHanoiStack();

}
