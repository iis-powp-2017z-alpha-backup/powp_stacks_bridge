package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;

/*
 * Konstruktor parametrowy klasy Stack od teraz przyjmuje interfejs StackIf jako parametr.
 * Pole prywatne mLocalStack również jest typu StackIf.
 * Konsekwencją tego zachowania jest to iż do tego konstruktora mogę przekazać obiekty 
 * należące do klas implementujących ten interfejs(StackList,StackArray)
 * Od teraz klasa Stack może korzystać  z implementacji stosu opartej na tablicy bądź liście
 */

/*
 *	Zadanie 13 Wnioski 
 * 1 . Navigate -> Open declaration(F3) : Po wykonaniu na metodzie zostaję przeniesiony do interfejsu StackIf.
 * 2 . Navigate -> Quick type Hierarchy (ctrl+t) : Otwiera się okno z możliwością wyboru przejścia do jednej z
 * klas implementujacych konkretną metodę.
 * 3 . Ctrl + praca myszki : Połączenie 2 poprzednuich punktów, Open Declaration daje taki sam rezultat jak
 * punkt 1 , Open implementation daje wyniki jak w punkcie 2
 */

public class stack {

	private StackIf mLocalStack;

	public stack() {
		mLocalStack = new StackArray();
	}

	public stack(StackIf mLocalStack) {
		super();
		this.mLocalStack = mLocalStack;
	}

	public void push(int i) {
		mLocalStack.push(i);
	}

	public boolean isEmpty() {
		return mLocalStack.isEmpty();
	}

	public boolean isFull() {
		return mLocalStack.isFull();
	}

	public int top() {
		return mLocalStack.top();
	}

	public int pop() {
		return mLocalStack.pop();
	}

}
