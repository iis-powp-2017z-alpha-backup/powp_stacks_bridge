package edu.kis.vh.stacks;


import edu.kis.vh.stacks.factory.BridgeInterface;
import edu.kis.vh.stacks.list.StackArray;

public class Stack {
    /**
     * Radoslaw Subczynski 3.3.2
     */

    //Poprawa formatu całości 3.1
    //Zmiana nazwy klasy, nazwa klasy nie powinna byc byc z malych liter 3.4
    private BridgeInterface bridgeInterface;

    public Stack(BridgeInterface bridgeInterface) {
        super();
        this.bridgeInterface = bridgeInterface;
    }

    public Stack() {
        bridgeInterface = new StackArray();
    }

    public void push(int i) {
        bridgeInterface.push(i);
    }

    public boolean isEmpty() {
        return bridgeInterface.isEmpty();
    }

    public boolean isFull() {
        return bridgeInterface.isFull();
    }

    public int top() {
        return bridgeInterface.top();
    }

    public int pop() {
        return bridgeInterface.pop();
    }

}
