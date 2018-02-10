package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class StackArray {

    //private int[] ITEMS = new int[12];
	private StackList stackList = new StackList();
	
    public int total = -1;

    public void push(int i) {
        //if (!isFull())
            //ITEMS[++total] = i;
    	stackList.pushElement(i);
    }

    public boolean isEmpty() {
       // return total == -1;
    	return stackList.empty();
    }

    public boolean isFull() {
        //return total == 11;
    	return stackList.full();
    	
    }

    public int top() {
        /*if (isEmpty())
            return -1;
        return ITEMS[total];
    	*/
    	return stackList.peek();
    }

    public int pop() {
        /*if (isEmpty())
            return -1;
        return ITEMS[total--];
        */
    	return stackList.pop();
    }

}