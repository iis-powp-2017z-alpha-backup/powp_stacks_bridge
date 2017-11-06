package edu.kis.vh.stacks.stackRealization;

public class StackList implements StackImplementationIfU{

	
	Node last;
		
	public void push(int value) {
		if (last == null)
			last = new Node(value);
		else {
			last.setNext(new Node(value));    // Before last.next = new Node(i)
			last.getNext().setPrev(last); // Before last.next.prev = last;
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
}
