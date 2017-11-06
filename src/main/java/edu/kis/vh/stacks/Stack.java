package edu.kis.vh.stacks;


import edu.kis.vh.stacks.factory.IStackImplementation;
import edu.kis.vh.stacks.list.StackArray;

public class Stack {
    /**
     * Radoslaw Subczynski 3.3.2
     */

    //Poprawa formatu całości 3.1
    //Zmiana nazwy klasy, nazwa klasy nie powinna byc byc z malych liter 3.4
    private IStackImplementation IStackImplementation;

    public Stack(IStackImplementation IStackImplementation) {
        super();
        this.IStackImplementation = IStackImplementation;
    }

    public void push(int i) {
        IStackImplementation.push(i);
    }

    public boolean isEmpty() {
        return IStackImplementation.isEmpty();
    }

    public boolean isFull() {
        return IStackImplementation.isFull();
    }

    public int top() {
        return IStackImplementation.top();
    }

    public int pop() {
        return IStackImplementation.pop();
    }

}
