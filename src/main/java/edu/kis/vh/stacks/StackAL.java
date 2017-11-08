package edu.kis.vh.stacks;

public interface StackAL {

	public static final int EMPTY_STACK = 0;
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}

/*
	Zadanie 10 pomogło w wykonaniu zadania 11, ponieważ wystarczyło zmienić watrtość zmiennej w jednym miejscu
*/