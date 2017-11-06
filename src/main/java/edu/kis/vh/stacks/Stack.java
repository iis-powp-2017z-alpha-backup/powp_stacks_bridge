// alt + -> / alt + <-     
// Powyzsze skroty zmianiaja karty zgodnie z historia ich otwarcia
package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackArray;
import edu.kis.vh.stacks.list.StackImplementationIfU;
import edu.kis.vh.stacks.list.StackList;

public class Stack {

	//protected StackArray stackArray = new StackArray();
	protected StackImplementationIfU stack;
	
	public int pop() {
		return stack.pop();
	}

	public void push(int value) {
		stack.push(value);
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

	public Stack(){
		this.stack = new StackList();
	}

	public Stack(int nrOfElements) {
		this.stack = new StackArray(nrOfElements);
	}
}

