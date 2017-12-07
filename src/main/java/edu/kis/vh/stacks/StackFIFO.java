package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

public class StackFIFO extends stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackInterface stackArray) {
		super(stackArray);
		// TODO Auto-generated constructor stub
	}

	public StackList temp = new StackList(); // Lista lepiej się sprawdzi do FIFO. Podczas usuwanie elementów z listy są
												// one bezpośrednio usuwane z pamięci w przeciwieństwie do tablicy.

	@Override
	public int pop() {
		while (!isEmpty())//
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())

			push(temp.pop());

		return ret;
	}
}

// 17. Klasa ta łamie zasade izolacji. Korzysta ona z StackList więc jest
// uzależniona od implementacji tej klasy a nie od abstrakcji interfejsu, który
// StackList implementuje.
// Można by było to naprawić poprzez zadeklarowanie temp z poziomu interfejsu
// StackInterface a pozniej zdefiniowanie jej z , np. jakiegoś zewnętrznego
// zrodla.