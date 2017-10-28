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

class Node {

	// Zmiany wprowadzone przy hermetyzxacji tych atrybutów dotyczyły tyklko klasy StackList
	private int value; //Dodany został getter i setter - usunąłem setter gdyż był nieprzydatny
	private Node prev; //Dodany został getter i setter
	private Node next; //Dodany został getter i setter

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
