package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class ListStacksFactory implements IstacksFactory {

    @Override
    public Stack getStandardStack() {
        return new Stack();
    }

    @Override
    public Stack getFalseStack() {
        return new Stack();
    }

    @Override
    public StackFIFO getFIFOStack() {
        return new StackFIFO(null);
    }

    @Override
    public StackHanoi getHanoiStack() {
        return new StackHanoi(null);
    }

}
