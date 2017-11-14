package edu.kis.vh.stacks.methods;

public interface IStackMethod {
	int EMPTY_STACK_INDICATOR = 0;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
}