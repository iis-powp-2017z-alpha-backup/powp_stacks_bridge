package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackArray;

/**
 * @author Piotr Nitecki 199111
 * 29.10.2017
 */
public class Stack implements StackAL {
	
	private StackArray stackArray = new StackArray();
	private StackAL LocalStack;

	public Stack(int[] iTEMS, int total) {
		super();
		ITEMS = iTEMS;
		this.total = total;
	}
	
	public Stack()
	{}
	
	public Stack (StackAL LocalStack) {
  		super();
  		this.LocalStack = LocalStack;
  	}

	private static final int FULL_STUCK = 11;
	private static final int EMPTY_STACK = -1;
	private static final int TAB_SIZE = 12;
	private int[] ITEMS = new int[TAB_SIZE];
	private int total = -1;

	
	public int getTotal() {
		return total;
	}


	@Override
	public void push(int i) {
		stackArray.push(i); 
	}


	@Override
	public boolean isEmpty() {
		return stackArray.isEmpty();
	}


	@Override
	public boolean isFull() {
		return stackArray.isFull();
	}


	@Override
	public int top() {
		return stackArray.top();
	}


	@Override
	public int pop() {
		return stackArray.pop();
	}

}

/*
 Konstruktor  klasy Stack przyjmuje interfejs StackAL jako parametr.
 Pole prywatne LocalStack jest typu StackAL.
 Klasa Stack może korzystać ze stosu opartej na tablicy lub liscie.
*/
