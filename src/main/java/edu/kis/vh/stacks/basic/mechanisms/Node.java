package edu.kis.vh.stacks.basic.mechanisms;

public class Node {

	private int value;
	private Node prev, next;

	public Node(int i) {
		this.value = i;
	}

	public Node() {
		this.value = 0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
