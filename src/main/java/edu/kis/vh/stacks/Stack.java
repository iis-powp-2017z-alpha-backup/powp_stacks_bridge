package edu.kis.vh.stacks;

import edu.kis.vh.stacks.basic.mechanisms.StackArray;

public class Stack {

	// 3.1.6 Konsekwencją zmiany typu na interfejs jest to, że wszystkie metody
	// muszą należeć do interfejsu, oraz to że będzie można łatwiej podmienić
	// StackArray na StackList
	private StackInterface stack;

	public Stack() {
		this.stack = new StackArray();
	}

	public Stack(StackInterface stack) {
		this.stack = stack;
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
