package edu.kis.vh.stacks;

public class StackArray {

    private static final int _twelve = 12;  // final

    private static final int MINUSONE = -1; // final

    private int[] items = new int[_twelve];

    private int total = MINUSONE;

    public int getTotal() {
        return total;
    }

    public void push(int i) {
        if (!isFull()) {
            getItems()[++total] = i;
        }
    }

    public int[] getItems() {
        return items;
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
        return getItems()[total];
    }

    public int pop() {
        if (isEmpty()) {
            return MINUSONE;
        }
        return getItems()[total--];
    }

}
