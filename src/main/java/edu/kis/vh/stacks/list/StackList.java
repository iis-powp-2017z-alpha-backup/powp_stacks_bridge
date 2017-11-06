package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.factory.IStackImplementation;

public class StackList implements IStackImplementation {
    //Poprawa formatu całości 3.1
    // Pole Node moze byc prywane i int 3.6
    // Moim zdaniem i nie jest konieczny.
    private Node last;

    private void pushElement(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.setNext(last);
        }
    }

    public boolean empty() {
        return last == null;
    }

    private int peek() {
        if (empty())
            return -1;
        return last.getValue();
    }

    @Override
    public void push(int i) {
        pushElement(i);
    }

    @Override
    public boolean isEmpty() {
       return empty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        return 0;
    }

    @Override
    public int pop() {
        if (empty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
