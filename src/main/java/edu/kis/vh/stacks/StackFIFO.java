package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stackRealization.StackList;

public class StackFIFO extends Stack {
	
// temp zostal zmieniony na StackList poniewaz przy duzej liczbe
// elementow domyslna wielkosc tablicy (czyli 12) uniemozliwilaby realizacje.
// Przy kazdej operacji pop konieczne byloby alokowanie nowej tablicy
// na potrzeby przpisania i odworcenia kolejnosci
	
	private StackList temp = new StackList();

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
