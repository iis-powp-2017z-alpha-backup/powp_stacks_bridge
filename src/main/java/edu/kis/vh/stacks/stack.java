package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;

/*
 * Konstruktor parametrowy klasy Stack od teraz przyjmuje interfejs StackIf jako parametr.
 * Pole prywatne mLocalStack również jest typu StackIf.
 * Konsekwencją tego zachowania jest to iż do tego konstruktora mogę przekazać obiekty 
 * należące do klas implementujących ten interfejs(StackList,StackArray)
 * Od teraz klasa Stack może korzystać  z implementacji stosu opartej na tablicy bądź liście
 */
public class stack {

	private StackIf mLocalStack;

	public stack() {
		mLocalStack = new StackArray();
	}

	public stack(StackIf mLocalStack) {
		super();
		this.mLocalStack = mLocalStack;
	}

	public void push(int i) {
		mLocalStack.push(i);
	}

	public boolean isEmpty() {
		return mLocalStack.isEmpty();
	}

	public boolean isFull() {
		return mLocalStack.isFull();
	}

	public int top() {
		return mLocalStack.top();
	}

	public int pop() {
		return mLocalStack.pop();
	}
	
	
				
}
