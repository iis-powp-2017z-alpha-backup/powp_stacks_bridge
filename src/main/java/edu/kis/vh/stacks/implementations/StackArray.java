package edu.kis.vh.stacks.implementations;

import edu.kis.vh.stacks.StackInterface;

public class StackArray implements StackInterface {

    public int total = -1;
    private int[] items = new int[12];

    @Override
    public void push(int i) {
        if (!isFull())
            items[++total] = i;
    }

    @Override
    public boolean isEmpty() {
        return total == -1;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK;
        return items[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK;
        return items[total--];
    }

}
