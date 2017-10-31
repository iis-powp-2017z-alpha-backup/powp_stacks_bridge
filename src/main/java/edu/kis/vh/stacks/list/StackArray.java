package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.factory.BridgeInterface;

public class StackArray implements BridgeInterface {

    /**
     * Radoslaw Subczynski 3.3.2
     */

    //Poprawa formatu całości 3.1
    //Zmiana nazwy klasy, nazwa klasy nie powinna byc byc z malych liter 3.4
    private final static int ITEMS_SIZE = 12; // punkt 3.5 //3.10
    private final static int EMPTY_STACK = -1;
    private final static int FULL_STACK = 11;

    private int[] ITEMS = new int[ITEMS_SIZE];

    //wygenrowany geter 3.7
    public int getTotal() {
        return total;
    }

    private int total = -1;

    @Override
    public void push(int i) {
        if (!isFull()) {
            ITEMS[++total] = i;
        }
    }

    public boolean isEmpty() {
        return total == EMPTY_STACK;
    }

    public boolean isFull() {
        return total == FULL_STACK;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY_STACK;
        }
        return ITEMS[total];
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK;
        }
        return ITEMS[total--];
    }

    @Override
    public boolean empty() {
        return false;
    }

}
