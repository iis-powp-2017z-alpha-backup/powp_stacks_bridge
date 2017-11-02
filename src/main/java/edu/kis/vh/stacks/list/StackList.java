package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackInterface;

public class StackList extends Stack implements StackInterface {
	// 3.1.4 - Open Declaration, Open Call Hierarchy, Open Type Hierarchy, Rename
	// int i - nie jest potrzebne
	private Node last;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peek() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
