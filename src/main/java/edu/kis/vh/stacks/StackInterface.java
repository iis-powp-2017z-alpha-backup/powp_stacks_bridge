package edu.kis.vh.stacks;

public interface StackInterface {

    public static final int EMPTY_STACK = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}