package edu.kis.vh.stacks;

/*
 * Odpowiedź Do zadania 11 :
 * Realizacja zadania 10 mi pomogła w wykonaniu zadania 11, gdyż wystarczyło zmienić jedną
 * wspólną wartość którą wyłuskałem w zadaniu 10
 */
public interface StackIf {

	public final static int errorCode = 0;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}