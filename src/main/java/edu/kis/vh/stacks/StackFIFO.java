package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

/*
 * obiekt temp może być i oniektem klasy StackArray i klasy StackList, postanowiłem jednak wybrać obiekt StackList
 * ponieważ w jednym z wcześniejszych punktów trzeba było tak zmienić implementację klasy StackFifo, aby
 * zaczęła korzystać z implementacji stosu z listą
 */
public class StackFIFO extends stack {

	public StackIf temp = new StackList();

	public StackFIFO() {
		super(new StackArray());
	}

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());
		return ret;
	}

}
