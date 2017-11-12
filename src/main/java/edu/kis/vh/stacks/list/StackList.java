package edu.kis.vh.stacks.list;

//TODO: This class doesn't have any impact on main method in class StacksDemo 
//or on others classes that are connected to class StackDemo or are used by this class.
//Maybe it would be better to remove it from this project
class StackList {

	private static final int RETURN_NUMBER = -1;
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

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return RETURN_NUMBER;
		return last.value;
	}

	public int pop() {
		if (empty())
			return RETURN_NUMBER;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
