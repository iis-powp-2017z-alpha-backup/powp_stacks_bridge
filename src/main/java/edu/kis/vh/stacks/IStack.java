package edu.kis.vh.stacks;

public interface IStack {
	
	static final int STACK_EMPTY = 0;
	// ulatwilo. Wprowadzilem tez drobne poprawki w StackArray
	
	void push(int i);
	
	boolean isEmpty();
	
 	boolean isFull();
 	
	int top();
	
	int pop();
	
} 