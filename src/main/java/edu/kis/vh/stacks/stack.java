package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackArray;

public class stack {

	private StackInterface stackArray = new StackArray(); //7. przez utworzony obiekt będzie można przekazać dowolny obiekt implementujący interfejs StackInterface

	public stack(StackInterface stackArray) { 
		super();
		this.stackArray = stackArray;
	}

	public stack() {
		super();
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


//13. F3 przenosi nas bezpośrednio do deklaracji. Naciśnięty ctrl i najechanie, np. na metodę powoduję wyświetlenie się menu z któego możemy wybrać czy chcemy przejść do deklaracji czy do czegoś innego (w zależności od tego nad czym bedzie kursor).
// Natomiast ctrl+T pokazuje nam hierarchię klas wywodzącą się z dziedziczenia.