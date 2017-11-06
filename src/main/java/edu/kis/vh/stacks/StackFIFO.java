package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.IStackImplementation;

public class StackFIFO extends Stack {

    private IStackImplementation IStackImplementation;


    public StackFIFO(edu.kis.vh.stacks.factory.IStackImplementation IStackImplementation) {
        super(IStackImplementation);
        this.IStackImplementation = IStackImplementation;
    }
    //Poprawa formatu całości 3.1

    @Override
    public int pop() {
        while (!isEmpty()) {
            IStackImplementation.push(super.pop());
        }
        int ret = pop();
        while (!IStackImplementation.isEmpty()) {
            IStackImplementation.push(pop());
        }
        return ret;
    }
}
