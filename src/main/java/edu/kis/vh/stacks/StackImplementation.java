package edu.kis.vh.stacks;

public interface StackImplementation {
	static final int FULL_STACK_VALUE = 11;

	static final int STACK_SIZE = 12;

	static final int EMPTY_STACK_VALUE = -1;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}