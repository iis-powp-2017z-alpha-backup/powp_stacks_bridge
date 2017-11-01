package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

//test 22.10.2017
/**
 * @author Bartłomiej Kubicki 19910
 *
 */
public class Stack {

	private StackList stackList;
	
	public Stack(StackList stackArray) {
		super();
		this.stackList = stackArray;
	}
	
	public Stack(){
		this.stackList = new StackList();
	}

	public int getTotal() {
		return stackList.getTotal();
	}
	
	public void push(int i) {
		stackList.push(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.top();
	}

	public int pop() {
		return stackList.pop();
	}

}
