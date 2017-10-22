package edu.kis.vh.stacks.list;

public class Node {
    //Poprawa formatu całości 3.1
    private int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
