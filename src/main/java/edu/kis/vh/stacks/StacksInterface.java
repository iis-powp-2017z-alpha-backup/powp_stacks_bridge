package edu.kis.vh.stacks;

public interface StacksInterface {
	
	public static final int EMPTY_STACK = 0; 
	//what I did in point 10 was helpful because I had to change the value of this constant only in one place.
	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}