package edu.kis.vh.stacks;

public interface IStack {
	
	final int EMPTY_STACK_VALUE = 0;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}

//Realizacja zadania 10 pomogla, poniewaz wystarczyło zmienic wartosc we wspolnym interface.