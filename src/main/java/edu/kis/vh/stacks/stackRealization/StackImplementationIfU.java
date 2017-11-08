package edu.kis.vh.stacks.stackRealization;

public interface StackImplementationIfU {

	// Umieszczenie w interfejscie wspolnieje dla implementujacych
	// ten interfejs klas ułatwiło refactoring
	static final int EMPTY_STACK = 0;
	
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}