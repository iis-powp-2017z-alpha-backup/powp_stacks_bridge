package edu.kis.vh.stacks;

import edu.kis.vh.stacks.imps.StackArray;

public class Stack {
    // Stack uzywa abstrakcji

    private final StackImp items;

    public Stack(StackImp items) {
        this.items = items;
    }

    public Stack() {
        items = new StackArray();
    }

    public int getTotal() {
        return items.getTotal();
    }

    public void push(int i) {
        if (!isFull()) {
            items.getItems();
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {

        return items.isFull();
    }

    public int top() {

        return items.top();
    }

    public int pop() {

        return items.pop();
    }

    public StackImp getItems() {
        return items;
    }
}
