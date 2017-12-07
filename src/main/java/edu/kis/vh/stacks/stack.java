package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackArray;

public class stack {

	private StackInterface stackI; // 7. przez utworzony obiekt będzie można przekazać dowolny
									// obiekt implementujący interfejs StackInterface

	public stack(StackInterface stackArray) {
		super();
		this.stackI = stackArray;
	}

	public stack() {
		super();
		stackI = new StackArray();
	}

	public void push(int i) {
		stackI.push(i);
	}

	public boolean isEmpty() {
		return stackI.isEmpty();
	}

	public boolean isFull() {
		return stackI.isFull();
	}

	public int top() {
		return stackI.top();
	}

	public int pop() {
		return stackI.pop();
	}

}

// 13. F3 przenosi nas bezpośrednio do deklaracji. Naciśnięty ctrl i najechanie,
// np. na metodę powoduję wyświetlenie się menu z któego możemy wybrać czy
// chcemy przejść do deklaracji czy do czegoś innego (w zależności od tego nad
// czym bedzie kursor).
// Natomiast ctrl+T pokazuje nam hierarchię klas wywodzącą się z dziedziczenia.

// alt + ->/<- przecsuwa do ostatnio/następnie odwiedzanej częsci kodu