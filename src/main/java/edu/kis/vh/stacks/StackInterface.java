package edu.kis.vh.stacks;

public interface StackInterface {

	// 3.1.11 Nie pomogło ponieważ moja stała była ustawiona na -1, gdzie ta wartość
	// występowała w obu klasach

	final int STACK_EMPTY = 0;

	public void push(int i);

	public boolean isEmpty();

	public boolean isFull();

	public int top();

	public int pop();

}