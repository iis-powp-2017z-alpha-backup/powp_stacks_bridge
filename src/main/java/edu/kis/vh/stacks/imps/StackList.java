package edu.kis.vh.stacks.imps;

import edu.kis.vh.stacks.StackImp;

public class StackList implements StackImp {

    private Node last;

    @Override
    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    @Override
    public int getTotal() {
        int total = 0;
        Node lastNode = last;
        while (lastNode != null) {
            total++;
            lastNode = last.prev;
        }
        return total;
    }

    @Override
    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
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
        if (isEmpty()) {
            return 0;
        }
        return last.value;
    }

    @Override
    public int[] getItems() {
        // TODO Auto-generated method stub
        return null;
    }

}
