package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class Stack {

    private StackInterface stackInterface;

    public Stack() {
        this.stackInterface = new StackList();
    }

    public Stack(StackInterface stackInterface) {
        this.stackInterface = stackInterface;
    }

    public void push(int i) {
        stackInterface.push(i);
    }

    public boolean isEmpty() {
        return stackInterface.isEmpty();
    }

    public boolean isFull() {
        return stackInterface.isFull();
    }

    public int top() {
        return stackInterface.top();
    }

    public int pop() {
        return stackInterface.pop();
    }
}