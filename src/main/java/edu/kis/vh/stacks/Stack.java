package edu.kis.vh.stacks;

import edu.kis.vh.stacks.basic.mechanisms.StackArray;

public class Stack implements StackInterface{

	//3.1.6 Konsekwencją zmiany typu na interfejs jest to, że wszystkie metody muszą należeć do interfejsu, oraz to że będzie można łatwiej podmienić StackArray na StackList
	private StackInterface stackArray = new StackArray();

	public Stack() {
		super();
		this.stackArray = new StackArray();
	}

	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}

}
