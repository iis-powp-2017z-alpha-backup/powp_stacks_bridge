package edu.kis.vh.stacks.stacksinterfaces;

import edu.kis.vh.stacks.StacksInterface;

public class StackList implements StacksInterface {

	private static final int RETURN_NUMBER = -1;
	Node last;
	int i;
	private int total = 0;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
		total++;
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return RETURN_NUMBER;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return RETURN_NUMBER;
		int ret = last.value;
		last = last.prev;
		total--;
		return ret;
	}
	
	public int getTotal() {
		if (isEmpty()) {
			return RETURN_NUMBER; 
		}
		return total;
	}

}
