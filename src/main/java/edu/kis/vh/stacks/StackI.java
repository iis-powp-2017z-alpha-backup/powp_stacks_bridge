package edu.kis.vh.stacks;

public interface StackI {

	public int EMPTY = -1;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int pop();

	int top();

}