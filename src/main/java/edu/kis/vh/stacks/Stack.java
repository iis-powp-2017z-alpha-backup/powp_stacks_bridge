package edu.kis.vh.stacks;

public class Stack {

    private static final int _twelve = 12;

    private static final int MINUSONE = -1;

    private int[] items = new int[_twelve];

    public int total = MINUSONE;

    public void push(int i) {
        if (!isFull()) {
            items[++total] = i;
        }
    }

    public boolean isEmpty() {
        return total == MINUSONE;
    }

    public boolean isFull() {

        return total == 11;
    }

    public int top() {
        if (isEmpty()) {
            return MINUSONE;
        }
        return items[total];
    }

    public int pop() {
        if (isEmpty()) {
            return MINUSONE;
        }
        return items[total--];
    }

}
