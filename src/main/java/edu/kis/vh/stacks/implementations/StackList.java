package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.StackInterface;

public class StackList implements StackInterface {
	/*
	Korzystalem z intellij w tym pnkcie. Wykorzystalem opcje tylko z podpowiedzi
	*/
	Node last;
	int i=-1;

	public void pushElement(int i) {
		if(!isFull()){
			if (last == null)
				last = new Node(i);
			else {
				last.next = new Node(i);
				last.next.prev = last;
				last = last.next;
			}
			this.i++;
		}
	}

	private boolean empty() {
		return last == null;
	}

	private boolean full() {
		return i==11;
	}

	private int peek() {
		if (empty())
			return emptyStack;
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
			return emptyStack;
		int ret = last.value;
		last = last.prev;
		i--;
		return ret;
	}

}
