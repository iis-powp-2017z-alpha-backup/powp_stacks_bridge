package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class stack {
	/*Punkt 7
	Dokonana modyfikacja pozwala na wykorzystanie jako atrybutu obiektu dowolnej klasy implementującej interfejs
	StackInterface. Dzięki temu zmieniając przekazany obiekt możemy szybko zmienić wykorzystywaną implementacje stosu.
	 */
	/* punkt 13
	Z racji tego że korzystam z IntelliJ pewne opcje sie różnią.
	Opcja Navigate->Declaration przneosi mnie do klasy StackInterface
	Opcja Navigate-> TypeHierarchy pokazuje okno z hierarchią klasy stack.
	Wciśniety ctrl podczas klikania w wywołanie metody przneosi do deklaracji tej metody
	 */

	private StackInterface stackInterface;

	public stack () {
		this.stackInterface = new StackList();
	}

	public stack(StackInterface stackInterface) {
		this.stackInterface = stackInterface;
	}

	public void push(int i) {
		stackInterface.push(i);
	}

	public boolean isEmpty() {
		return stackInterface.isEmpty();
	}

	public boolean isFull() {
		return stackInterface.isFull();
	}

	public int top() {
		return stackInterface.top();
	}

	public int pop() {
		return stackInterface.pop();
	}
}
