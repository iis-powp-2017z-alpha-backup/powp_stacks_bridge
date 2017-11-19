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

	public StackList temp = new StackList(); // Listaa lepiej się sprawdzi do FIFO. Podczas usuwanie elementów z listy są one bezpośrednio usuwane z pamięci w przeciwieństwie do tablicy.
	
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
