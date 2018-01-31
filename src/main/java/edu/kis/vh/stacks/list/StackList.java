package edu.kis.vh.stacks.list;

public class StackList {

    Node last;
    int i;

    public void pushElement(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
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
        if (empty()) {
            return -1;
        }
        return last.value;
    }

    private int pop() {
        if (empty()) {
            return -1;
        }
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
