package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public interface IstacksFactory {
    //Poprawa formatu całości 3.1

    Stack GetStandardStack();

    Stack GetFalseStack();

    StackFIFO GetFIFOStack();

    StackHanoi GetHanoiStack();

}
