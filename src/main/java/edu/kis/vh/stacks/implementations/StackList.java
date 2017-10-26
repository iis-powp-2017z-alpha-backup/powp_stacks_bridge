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
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
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
			return -1;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
