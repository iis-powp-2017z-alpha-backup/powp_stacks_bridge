package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

//Zle wciaecia. Poprawiono
/**
 * @author Aliaksei
 *
 */
public interface StacksFactory {

	public Stack GetStandardStack();

	public Stack GetFalseStack();

	public StackFIFO GetFIFOStack();

	public StackHanoi GetHanoiStack();

}
