package edu.kis.vh.stacks;

/* Zad 11
Musialem zmienic wartosc tylko w 1 miejscu.	
*/

public interface StackInterface {
	
	public static final int EMPTY_STACK = 0;
	
	void push(int i);
	
	boolean isEmpty();
	
	boolean isFull();
	
	int top();
	
	int pop();

}
//