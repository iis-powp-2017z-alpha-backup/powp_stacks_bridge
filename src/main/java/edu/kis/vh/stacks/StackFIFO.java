package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;

/**
 * @author 191838
 *
 */
public class StackFIFO extends Stack {

	/**
	 * Temporary stack
	 */
	private final StackArray temp = new StackArray();

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.Stack#pop()
	 */
	@Override
	public int pop() {
		while (!isEmpty())

			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())

			push(temp.pop());

		return ret;
	}
}
