package edu.kis.vh.stacks.imps;

import edu.kis.vh.stacks.StackImp;

public class StackArray implements StackImp {

    private int[] items = new int[StackImp._twelve];

    private int total = StackImp.MINUSONE;

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
        return total == StackImp.MINUSONE;
    }

    @Override
    public boolean isFull() {

        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return StackImp.MINUSONE;
        }
        return getItems()[total];
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return StackImp.MINUSONE;
        }
        return getItems()[total--];
    }

}
