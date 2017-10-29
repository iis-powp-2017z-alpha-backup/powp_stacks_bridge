package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK = -1;
	Node last;
	private int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));    // Before last.next = new Node(i)
			last.getNext().setPrev(last); // Before last.next.prev = last;
			last = last.getNext();
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY_STACK;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return EMPTY_STACK;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	int getI() {
		return i;
	}

	void setI(int i) {
		this.i = i;
	}

}
