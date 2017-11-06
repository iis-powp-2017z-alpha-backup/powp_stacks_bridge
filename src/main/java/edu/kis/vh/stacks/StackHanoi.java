package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.IStackImplementation;

public class StackHanoi extends Stack {
    //Poprawa formatu całości 3.1
    //Dodanie modyfikatora dostpu 3.6
    private int totalRejected = 0;

    public StackHanoi(edu.kis.vh.stacks.factory.IStackImplementation IStackImplementation) {
        super(IStackImplementation);
    }


    public int reportRejected() {
        return totalRejected;
    }

    public void push(int in) {
        if (!isEmpty() && in > top()) {
            totalRejected++;
        } else {
            super.push(in);
        }
    }
}
