package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;
import edu.kis.vh.stacks.StacksInterface;

public class Stack {
	/* Because stackInter is of StacksInterface type (also of Interface type) it means that i can give to methods classes objects
	that implements Interface "StacksInterface". In my code those are object of StacksArray and StacksList classes*/
	private StacksInterface stackInter;
	
	public Stack() {
		this(new StackList());
	}
	
	public Stack(StacksInterface stackInter) {
		super();
		this.stackInter = stackInter;
	}

	public int getTotal() {
		return stackInter.getTotal();
	}

	public void push(int i) {
		stackInter.push(i);
	}

	public boolean isEmpty() {
		return stackInter.isEmpty();
	}

	public boolean isFull() {
		return stackInter.isFull();
	}

	public int top() {
		return stackInter.top();
	}

	public int pop() {
		return stackInter.pop();
	}

}
