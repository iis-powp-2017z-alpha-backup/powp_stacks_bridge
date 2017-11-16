package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

public class Stack {
	public Stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}
	
	public Stack(){
		this.stackList = new StackList();
	}
	
	private IStack stackList;

	public void push(int i) {
		stackList.push(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.top();
	}

	public int pop() {
		return stackList.pop();
	}
			
}

//Dzieki tej zmianie mamy mozliwosc wykorzystania dowolnej klasy implementującej interface IStack