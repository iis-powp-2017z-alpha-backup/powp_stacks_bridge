package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.InterStackFace;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

/**
 * @author Aliaksei
 *
 */
public class DefaultStacksFactory implements StacksFactory {

	@Override
	public InterStackFace getStandardStack() {
		return new Stack();
	}

	@Override
	public InterStackFace getFalseStack() {
		return new Stack();
	}

	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
