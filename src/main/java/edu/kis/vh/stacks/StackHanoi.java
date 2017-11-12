package edu.kis.vh.stacks;

/**
 * @author Aleksandra Wentlandt 198154
 *
 */
public class StackHanoi extends Stack {

	int totalRejected = 0;
	
	/**
	 * @returns the number of integers that where higher than the one on top of the (Hanoi)stack and saves it in variable "totalRejected"
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.Stack#push(int)
	 * 
	 */
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
	
}
