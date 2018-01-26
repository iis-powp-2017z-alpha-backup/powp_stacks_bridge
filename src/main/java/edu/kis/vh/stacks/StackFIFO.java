package edu.kis.vh.stacks;

/**
 * @author Aliaksei
 *
 */
public class StackFIFO extends Stack {

	public InterStackFace temp = new Stack();

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
