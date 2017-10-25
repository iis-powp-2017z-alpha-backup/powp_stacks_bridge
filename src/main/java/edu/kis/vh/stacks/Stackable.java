package edu.kis.vh.stacks;

public interface Stackable {

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}