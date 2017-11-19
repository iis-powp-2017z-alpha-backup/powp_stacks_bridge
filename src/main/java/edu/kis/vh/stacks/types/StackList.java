package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack{

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

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int poppedOutValue = last.getValue();
		last = last.getPrev();
		return poppedOutValue;
	}

	Node getLast() {
		return last;
	}

	void setLast(Node last) {
		this.last = last;
	}

class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
		}

		int getValue() {
			return value;
		}

		Node getPrev() {
			return prev;
		}

		void setPrev(Node prev) {
			this.prev = prev;
		}

		Node getNext() {
			return next;
		}

		void setNext(Node next) {
			this.next = next;
		}
		
	}
}