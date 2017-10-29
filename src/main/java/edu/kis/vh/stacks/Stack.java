package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

//test 22.10.2017
/**
 * @author Bartłomiej Kubicki 19910
 *
 */
public class Stack {

	private StackArray stackArray = new StackArray();
	private StackList stackList = new StackList();
	
	
	public Stack(int[] iTEMS, int total) {
		
	}
	
	public Stack(){
	}
	
	private static final int STACK_FULL = 11;

	private static final int EMPTYSTACK = -1;

	private static final int TABLESIZE = 12;

	private int[] ITEMS = new int[TABLESIZE];

	private int total = -1;

	public int getTotal() {
		return total;
	}

	
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
