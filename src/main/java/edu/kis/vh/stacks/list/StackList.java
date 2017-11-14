package edu.kis.vh.stacks.list;

import static edu.kis.vh.stacks.Stack.EMPTY_STACK_INDICATOR;

public class StackList {

	private Node last;
	private int i;

	public void pushElement(int i) {
		if (last == null) {
			last = new Node(i);
		} else {
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
		if (empty()) {
			return EMPTY_STACK_INDICATOR;
		}
		return last.getValue();
	}

	public int pop() {
		if (empty()) {
			return -1;
		}
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

class Node {

	private int value;
	private Node prev;
	private Node next;
	
	//gettery setter
	
	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public Node getNext() {
		return next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int i) {
		value = i;
	}

}