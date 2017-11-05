package edu.kis.vh.stacks.list;

public class StackList {

	// Refaktoryzacja do wzorca Bridge:
	// Pkt 4. Nie użyłem żadnej opcji z Eclipse IDE, wszystkie niezbędne zmiany wprowadziłem ręcznie
	
	private static final int IS_EMPTY = -1;
	private Node last;

	private int i;
	
	public StackList() {
		this.i = 0;
	}

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		this.i++;
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return IS_EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return IS_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		this.i--;
		return ret;
	}

	public int getI() {
		return i;
	}
}
