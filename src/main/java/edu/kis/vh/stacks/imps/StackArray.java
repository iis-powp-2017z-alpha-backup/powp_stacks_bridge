package edu.kis.vh.stacks.imps;

import edu.kis.vh.stacks.StackImp;

public class StackArray implements StackImp {

    private static final int _twelve = 12;  // final

    private static final int MINUSONE = -1; // final

    private int[] items = new int[_twelve];

    private int total = MINUSONE;

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public void push(int i) {
        if (!isFull()) {
            getItems()[++total] = i;
        }
    }

    public int[] getItems() {
        return items;
    }

    @Override
    public boolean isEmpty() {
        return total == MINUSONE;
    }

    @Override
    public boolean isFull() {

        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return MINUSONE;
        }
        return getItems()[total];
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return MINUSONE;
        }
        return getItems()[total--];
    }

}
