package edu.kis.vh.stacks;

public interface IStack {
	
	final int STACK_EMPTY = 0;
	// ulatwilo, lecz musialem poprawic rowniez testy
	
	void push(int i);
	
	boolean isEmpty();
	
 	boolean isFull();
 	
	int top();
	
	int pop();
	
} 