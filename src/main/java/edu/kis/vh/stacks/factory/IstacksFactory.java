package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

interface IstacksFactory {

	public Stack getStandardStack();

	public Stack getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
// alt + -> to kolejny plik a alt + <- to poprzedni