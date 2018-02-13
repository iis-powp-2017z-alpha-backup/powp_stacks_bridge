package edu.kis.vh.stacks.list;

public class Node {

	// ustawienie tych pol jako prywatne i wygenerowanie dla nich setterow i getterow powoduje, ze odowujac sie do tych
	// wartosci, nalezy skorzystac z metod setX lub getX np. last.getValue() zamiast last.value w klasie StackList
	private int value;
	private Node prev, next;

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