package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFifo;
import edu.kis.vh.stacks.StackHanoi;

interface IstacksFactory {

	public Stack GetStandardStack();

	public Stack GetFalseStack();

	public StackFifo GetFIFOStack();

	public StackHanoi GetHanoiStack();

}
