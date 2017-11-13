package edu.kis.vh.stacks.implementations;

public class Node {

	int value;
	
	public int getValue() {
		return value;
	}

	Node prev, next;

	public Node(int i) {
		value = i;
	}

}
