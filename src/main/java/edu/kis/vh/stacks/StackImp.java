package edu.kis.vh.stacks;

public interface StackImp {

    static final int _twelve = 12;  // final
    static final int MINUSONE = 0; // final
    // 3.1.11 pomoglo

    int getTotal();

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int[] getItems();

}
