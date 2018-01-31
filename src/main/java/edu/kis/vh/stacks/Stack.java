package edu.kis.vh.stacks;

public class Stack {

    private final StackArray items = new StackArray();

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

}
