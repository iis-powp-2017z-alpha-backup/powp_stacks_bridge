package edu.kis.vh.stacks;

public interface IStack {

	static final int IS_EMPTY = 0;
	
	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}