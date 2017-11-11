package edu.kis.vh.stacks.list;

public class Node {

	private int value;	//w klasie StackList zmiana na last.getValue()
	private Node prev;	//w klasie StackList zmiana na last.setPrev oraz last.getPrev
	private Node next;	//w klasie StackList zmiana na last.setNext oraz last.getNext

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
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
