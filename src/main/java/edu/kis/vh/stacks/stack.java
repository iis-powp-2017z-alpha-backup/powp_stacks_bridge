package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stackIImpl.Node;
import edu.kis.vh.stacks.stackIImpl.StackArray;
import edu.kis.vh.stacks.stackIImpl.StackList;

//komentarz dla sprawdzenia commita
public class stack implements StackI {
	private StackI stackArray = new StackArray(); // Przyjety do inicjalizacji StackArray, w celu uniknięcia null pointera.

	public stack(StackI stackArray) {
			super();
			this.stackArray = stackArray;
		}
	public stack(){
		super();
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
	public int pop() {
		return stackArray.pop();

	}

	@Override
	public int top() {
		return stackArray.top();
	}
	
	
}
