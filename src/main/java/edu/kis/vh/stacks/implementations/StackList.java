package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.StackIf;

/*
 * Wykorzystane metody przy rozwiązywania zadania 4 :
 * Source -> Override/ImplementMethods
 * Source -> Generate C-tor using fields
 * Source -> format
 * ctrl + space -> autouzupełnianie
 * 
 */

public class StackList implements StackIf {

	Node last;
	int i;

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

	public int top() {
		if (isEmpty())
			return errorCode;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return errorCode;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
