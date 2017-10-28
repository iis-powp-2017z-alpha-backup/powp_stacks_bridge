package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

/**
 * @author ukamiski179 Implementacja Stosu polegajaca na tym iż na wierzchołku
 *         stosu nie można położyć liczby większej niż ta która się na
 *         wierzchołku znajduje
 */
public class StackHanoi extends Stack {

	private int totalRejected = 0;

	/**
	 * Domyślny konstruktor
	 */
	public StackHanoi() {
		super(new StackList());
	}

	/**
	 * Konstruktor parametrowy
	 * @param mLocalStack konkretna implementacja stosu na której będzie się opierać klasa StackHanoi
	 */
	public StackHanoi(StackIf mLocalStack) {
		super(mLocalStack);
	}

	/**
	 * reportRejected zwraca liczbę elementów których nie można położyć na wierzchołku stosu
	 * @return liczba elementów których nie można położyć na wierzchołku stosu
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.Stack#push(int)
	 */
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}

}
