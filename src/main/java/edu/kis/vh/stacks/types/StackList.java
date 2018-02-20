package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack{

	private Node last;
	private int i;	

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public int peek() {
		if (isEmpty())
			return 0;
		return last.getValue();
	}

	public int top() {
		if (isEmpty())
			return STACK_EMPTY;
		return last.getValue();
	}
	
	public int pop() {
		if (isEmpty())
			return STACK_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getI() {
		return i;
	}
	

	class Node {

		// ustawienie tych pol jako prywatne i wygenerowanie dla nich setterow i getterow powoduje, ze odowujac sie do tych
		// wartosci, nalezy skorzystac z metod setX lub getX np. last.getValue() zamiast last.value w klasie StackList
		private int value;
		private Node prev, next;

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
	
}

// przydatna opcje:
// Source -> Override/Implement Methods
// Source -> Generate Delegate Methods