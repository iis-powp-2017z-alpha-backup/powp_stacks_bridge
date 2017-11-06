// alt + -> / alt + <-     
// Powyzsze skroty zmianiaja karty zgodnie z historia ich otwarcia
package edu.kis.vh.stacks;

public class Stack {

	protected StackArray stackArray = new StackArray();
	
	public Stack(){
	}
	
	public Stack(StackArray stackArray) {
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
