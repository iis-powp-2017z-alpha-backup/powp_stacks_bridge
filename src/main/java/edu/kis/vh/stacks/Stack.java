package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {

	private IStack stackArray = new StackArray();
	//3.1.7 Mozna teraz przekazac dowolny obiekt implementujacy interfejs IStack
	public Stack(IStack stackArray) {
		super();
		this.stackArray = stackArray;
	}

	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}
	
	public Stack() {
		
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
