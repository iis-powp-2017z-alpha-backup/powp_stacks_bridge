package edu.kis.vh.stacks;

public class StackArray implements StackInterface {

    private int[] ITEMS = new int[12];

    public int total = -1;

    @Override
    public void push(int i) {
        if (!isFull())
            ITEMS[++total] = i;
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
            return -1;
        return ITEMS[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        return ITEMS[total--];
    }

}
