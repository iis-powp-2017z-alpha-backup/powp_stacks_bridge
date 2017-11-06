package edu.kis.vh.stacks;

import edu.kis.vh.stacks.basic.mechanisms.StackArray;

public class StackFIFO extends Stack {

	public StackInterface temp;

	public StackFIFO() {
		temp = new StackArray();
	}

	public StackFIFO(StackInterface stack) {
		this.temp = stack;
	}

	// 3.1.14 - Uwazam, ze StackList będzie najlepszy, ponieważ nie trzeba pamiętać
	// o
	// rozmiarach stosu

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
