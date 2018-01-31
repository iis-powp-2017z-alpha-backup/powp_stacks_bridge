package edu.kis.vh.stacks;

import edu.kis.vh.stacks.imps.StackArray;

public class StackFIFO extends Stack {

    public StackArray temp = new StackArray();
    // lepsze odwolanie do hierarchi bo skraca droge

    public StackFIFO(StackImp items) {
        super(items);
        // TODO Auto-generated constructor stub
    }

    @Override // override
    public int pop() {
        while (!isEmpty()) {
            temp.push(super.pop());
        }

        int ret = temp.pop();

        while (!temp.isEmpty()) {
            push(temp.pop());
        }

        return ret;
    }
}
