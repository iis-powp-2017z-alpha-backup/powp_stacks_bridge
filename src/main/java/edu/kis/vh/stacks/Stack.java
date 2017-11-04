package edu.kis.vh.stacks;

import edu.kis.vh.stacks.basic.mechanisms.StackArray;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class Stack implements StackInterface {

	// 3.1.6 Konsekwencją zmiany typu na interfejs jest to, że wszystkie metody
	// muszą należeć do interfejsu, oraz to że będzie można łatwiej podmienić
	// StackArray na StackList
	private StackInterface stack;

	public Stack() {
		super();
		this.stack = new StackArray();
	}

	public Stack(StackArray stackArray) {
		super();
		this.stack = stackArray;
	}

	public Stack(StackList stackList) {
		super();
		this.stack = stackList;
	}
	
	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}

}
