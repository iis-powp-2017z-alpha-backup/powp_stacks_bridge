package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.factory.Bridge;

public class StackList implements Bridge {
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

    @Override
    public boolean empty() {
        return last == null;
    }

    private boolean full() {
        return false;
    }

    private int peek() {
        if (empty())
            return -1;
        return last.getValue();
    }

<<<<<<< HEAD
    private int pop() {
=======

    @Override
    public void push(int i) {
        push(i);
    }

    @Override
    public boolean isEmpty() {
       return isEmpty();
    }

    @Override
    public boolean isFull() {
        return isFull();
    }

    @Override
    public int top() {
        return top();
    }

    @Override
    public int pop() {
>>>>>>> 41e1df3177ccfcb27d6f8b8a62003ed1e6cbbcce
        if (empty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
