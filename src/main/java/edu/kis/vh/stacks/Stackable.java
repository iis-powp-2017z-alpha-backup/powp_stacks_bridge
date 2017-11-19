package edu.kis.vh.stacks;

public interface Stackable {

	public int EMPTY_VALUE = -1;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}