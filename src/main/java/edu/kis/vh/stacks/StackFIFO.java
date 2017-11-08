package edu.kis.vh.stacks;

import edu.kis.vh.stacks.stackRealization.StackArray;
import edu.kis.vh.stacks.stackRealization.StackList;

public class StackFIFO extends Stack {
	
// temp zostal zmieniony na StackList poniewaz przy duzej liczbe
// elementow domyslna wielkosc tablicy (czyli 12) uniemozliwilaby realizacje.
// Przy kazdej operacji pop konieczne byloby alokowanie nowej tablicy
// na potrzeby przpisania i odworcenia kolejnosci
	
	public StackFIFO() {
		super();
	}

	public StackFIFO(int nrOfElements) {
		super(nrOfElements);
	}

	public StackFIFO(StackArray stackArrray) {
		super(stackArrray);
	}

	public StackFIFO(StackList stackList) {
		super(stackList);
	}

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
