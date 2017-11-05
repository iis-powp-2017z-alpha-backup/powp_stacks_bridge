package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack {

	// Refaktoryzacja do wzorca Bridge:
	// Pkt 4. Nie użyłem żadnej opcji z Eclipse IDE, wszystkie niezbędne zmiany wprowadziłem ręcznie
	
	private static final int IS_EMPTY = -1;
	private Node last;

	private int i;
	
	public StackList() {
		this.i = 0;
	}

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		this.i++;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return IS_EMPTY;
		return last.getValue();
	}
	
	@Override
	public int pop() {
		if (isEmpty())
			return IS_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		this.i--;
		return ret;
	}

	@Override
	public int getTotal() {
		return i;
	}
}
