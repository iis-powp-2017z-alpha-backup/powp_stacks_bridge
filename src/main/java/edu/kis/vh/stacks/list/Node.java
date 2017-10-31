package edu.kis.vh.stacks.list;

class Node {
    //Poprawa formatu całości 3.1
    private int value;
    private Node prev, next;

     Node(int i) {
        value = i;
    }

    int getValue() {
        return value;
    }

    Node getPrev() {
        return prev;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
