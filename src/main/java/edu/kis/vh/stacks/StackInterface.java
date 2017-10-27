package edu.kis.vh.stacks;

/* Punkt 11
Dzięki realizacji punktu 10 musiałem zmienić wartość tylko w jednym miejscu w kodzie.
 */

public interface StackInterface {

    public static final int emptyStack = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
