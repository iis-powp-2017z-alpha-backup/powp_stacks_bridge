package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackArray;
import edu.kis.vh.stacks.types.StackList;

public class Stack {

	private IStack stackImplementation = new StackArray();

	// 3.1.7 Mozna teraz przekazac dowolny obiekt implementujacy interfejs IStack
	public Stack(IStack stackArray) {
		super();
		this.stackImplementation = stackArray;
	}

	public Stack(StackArray stackArray) {
		super();
		this.stackImplementation = stackArray;
	}

	public Stack() {

	}

	public void push(int i) {
		stackImplementation.push(i);
	}

	public boolean isEmpty() {
		return stackImplementation.isEmpty();
	}

	public boolean isFull() {
		return stackImplementation.isFull();
	}

	public int top() {
		return stackImplementation.top();
	}

	public int pop() {
		return stackImplementation.pop();
	}

}

/* Bridge 3.1.13
 * F3 przenosi do deklaracji
 * CTRL+T pokazuje hierarchie klas
 * CTRL otwiera menu z obiema opcjami
 */
