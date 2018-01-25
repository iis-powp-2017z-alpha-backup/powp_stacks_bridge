package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.InterStackFace;

/**
 * @author Aliaksei
 *
 */
public class StackList implements InterStackFace {

	private static final int EMPTY = -1;
	private Node last;
	int i;
	private int total;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
		total = total + 1;
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.prev;
		total = total - 1;
		return ret;
	}

	public int getTotal() {
		if (isEmpty()) {
			return EMPTY;
		}
		return total;
	}

}
