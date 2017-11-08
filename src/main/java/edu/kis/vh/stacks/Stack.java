// alt + -> / alt + <-     
// Powyzsze skroty zmianiaja karty zgodnie z historia ich otwarcia
package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stackRealization.StackArray;
import edu.kis.vh.stacks.stackRealization.StackImplementationIfU;
import edu.kis.vh.stacks.stackRealization.StackList;

public class Stack {

	// W konsekwencji mamy referencje na interfejs ktora moze 
	// przechowywac adres obiektu ArrayStack lub ListStack.
	// Rozwiazanie jest uniwersalne i nie ogranicza programisty 
	// do jednego typu realizacji.
	// Ponadto ewentualne zmiany w implementacji czy nawet dodanie
	// nowej klasy implementujacej interfejs nie wplynie na korzystanie
	// z klasy Stack.
	
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
	public Stack(StackArray stackArrray){
		this.stack = stackArrray;
	}
	public Stack(StackList stackList){
		this.stack = stackList;
	}
}

