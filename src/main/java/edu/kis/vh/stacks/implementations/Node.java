package edu.kis.vh.stacks.implementations;

public class Node {

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
