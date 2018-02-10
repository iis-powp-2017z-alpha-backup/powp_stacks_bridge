package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.StackInterface;

public class StackList implements StackInterface{
/*
  Korzystam z intellij. Wykorzystalem opcje tylko z podpowiedzi
*/
	Node last;
	int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	private boolean empty() {
		return last == null;
	}

	private boolean full() {
		return false;
	}

	private int peek() {
		if (empty())
			return -1;
		return last.value;
	}
	@Override
		public void push(int i) {
			this.pushElement(i);
		}
	
		@Override
		public boolean isEmpty() {
			return this.empty();
		}
	
		@Override
		public boolean isFull() {
			return this.full();
		}
	
		@Override
		public int top() {
			return this.peek();
		}

	public int pop() {
		if (empty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
//