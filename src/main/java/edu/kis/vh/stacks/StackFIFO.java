package edu.kis.vh.stacks;

import edu.kis.vh.stacks.basic.mechanisms.StackArray;
import edu.kis.vh.stacks.basic.mechanisms.StackList;

public class StackFIFO extends StackList implements StackInterface{

	public StackInterface temp;

	public StackFIFO() {
		super();
		this.temp = new StackArray();
	}

	public StackFIFO(StackList stackList) {
		super();
		this.temp = stackList;
	}

	public StackFIFO(StackArray stackArray) {
		super();
		this.temp = stackArray;
	}

	// 3.1.14 - Uwazam, ze StackList będzie najlepszy, ponieważ nie trzeba pamiętać o
	// rozmiarach stosu
	@Override
	public int pop() {
		while (!isEmpty()) {
			temp.push(super.pop());
		}
		int ret = temp.pop();
		while (!temp.isEmpty()) {
			push(temp.pop());
		}
		return ret;
	}

}
