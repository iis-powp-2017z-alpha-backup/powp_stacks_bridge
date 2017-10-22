package edu.kis.vh.stacks.list;

public class StackList {
    //Poprawa formatu całości 3.1
    // Pole Node moze byc prywane i int 3.6
    // Moim zdaniem i nie jest konieczny.
    private Node last;

    public void pushElement(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.setNext(last);
        }
    }

    private boolean empty() {
        return last == null;
    }

    public boolean full() {
        return false;
    }

    public int peek() {
        if (empty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (empty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
