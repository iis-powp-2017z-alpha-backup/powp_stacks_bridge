package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackArray;
import edu.kis.vh.stacks.implementations.StackList;

/*
 * Najlepszym eyborem będzie pójście w ślady starej implementacji i zmienić parametr temp na stos z implementacją
 * tablicową (wcześniej stos korzystał z implementacji stosu z klasy stack (StackArray))
 */
public class StackFIFO extends stack {

	public StackIf temp = new StackArray();

	public StackFIFO() {
		super(new StackList());
	}

	public StackFIFO(StackIf mLocalStack) {
		super(mLocalStack);
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
