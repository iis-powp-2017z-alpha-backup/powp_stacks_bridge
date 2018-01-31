package edu.kis.vh.stacks;

public interface StackImp {

    static final int _twelve = 12;  // final
    static final int MINUSONE = -1; // final

    int getTotal();

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int[] getItems();

}
