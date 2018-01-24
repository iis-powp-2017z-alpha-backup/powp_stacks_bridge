package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;

public class StackFIFO extends Stack {


    public StackList temp;

    public StackFIFO() {
        super();
        temp = new StackList();
    }

    public StackFIFO(StackInterface stackInterface) {
        super(stackInterface);
        temp = new StackList();
    }

    @Override
    public int pop() {
        while (!isEmpty())

            temp.push(super.pop());

        int ret = temp.pop();

        while (!temp.isEmpty())

            push(temp.pop());

        return ret;
    }
}