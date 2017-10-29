package edu.kis.vh.stacks;


import edu.kis.vh.stacks.list.StackArray;

public class Stack  {

    /**
     * Radoslaw Subczynski 3.3.2
     */

    //Poprawa formatu całości 3.1
    //Zmiana nazwy klasy, nazwa klasy nie powinna byc byc z malych liter 3.4
    private final static int ITEMS_SIZE = 12; // punkt 3.5 //3.10
    private final static int EMPTY_STACK = -1;
    private final static int FULL_STACK = 11;

    private int[] ITEMS = new int[ITEMS_SIZE];
    private StackArray stackArray = new StackArray();

    public Stack(int[] ITEMS, int total) {
        super();
        this.ITEMS = ITEMS;
        this.total = total;
    }

    public Stack() {

    }

    //wygenrowany geter 3.7
    private int getTotal() {
        return total;
    }

    private int total = -1;

    public void push(int i) {
        stackArray.push(i);
    }

    public boolean isEmpty() {
        return stackArray.isEmpty();
    }

    public boolean isFull() {
        return stackArray.isFull();
    }

    public int top() {
        return stackArray.top();
    }

    public int pop() {
        return stackArray.pop();
    }

}
