package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

    int totalRejected = 0;

    public StackHanoi(StackImp items) {
        super(items);
        // TODO Auto-generated constructor stub
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void push(int in) {
        if (!isEmpty() && in > top()) {
            totalRejected++;
        } else {
            super.push(in);
        }
    }
}
