package edu.kis.vh.stacks;

public interface IStack {

	// Bridge:
	// pkt 11: Pomogla mi zmiana z pkt 10, poniewaz nie musialem dokonywac zmian
	// w dwoch miejscach tylko w jednym

	static final int IS_EMPTY = 0;

	int getTotal();

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}