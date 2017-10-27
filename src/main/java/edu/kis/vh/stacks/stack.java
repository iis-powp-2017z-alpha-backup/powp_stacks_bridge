package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;
import edu.kis.vh.stacks.list.Node;

//komentarz dla sprawdzenia commita
public class stack implements StackI {

	StackI stackArray; //= new Object();   //// WTF

	//public stack(StackArray stackArray) {
	//	super();
	//	this.stackArray = stackArray;
	//}
	public stack(StackI stackArray) {
			super();
			this.stackArray = stackArray;
		}
	public stack(){
		super();
	}
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackI#push(int)
	 */
	@Override
	public void push(int i) {
		stackArray.push(i);
		
	}
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackI#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return stackArray.isEmpty();
	}
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackI#isFull()
	 */
	@Override
	public boolean isFull() {
		return stackArray.isFull();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackI#pop()
	 */
	@Override
	public int pop() {
		return stackArray.pop();
	}
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackI#top()
	 */
	@Override
	public int top() {
		return stackArray.top();
	}
	
	
	
}
