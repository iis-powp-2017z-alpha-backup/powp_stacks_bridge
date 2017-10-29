package edu.kis.vh.stacks.list;

class StackList {

	private static final int IS_EMPTY = -1;
	private Node last;
	private int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
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
			return IS_EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return IS_EMPTY;
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
