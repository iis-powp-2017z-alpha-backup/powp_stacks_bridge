package edu.kis.vh.stacks;
// test
public class StackFIFO extends stack {

	public stack temp;
	
		public StackFIFO() {
			super();
			temp = new stack();
		}
	
		
	@Override
	public int pop() {
		while (!isEmpty())
		
		temp.push(super.pop());
		
		int ret = temp.pop();
		
		while (!temp.isEmpty())
	
		push(temp.pop());
		
		return ret;
	}
}
