package edu.kis.vh.stacks;

/**
 * @author Aliaksei
 *
 */
public class StackHanoi extends Stack {

	private static int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
