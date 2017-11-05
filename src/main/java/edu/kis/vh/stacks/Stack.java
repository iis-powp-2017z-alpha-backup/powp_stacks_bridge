package edu.kis.vh.stacks;

public class Stack {

	private BasicStackImpl stackImpl;
	private int total;
	private int element;
	
	 public Stack(BasicStackImpl stackImpl) {
		 this.stackImpl = stackImpl;
	 }
	
	public void push(int i) {
		stackImpl.push(element);
	}
	
		public boolean isEmpty() {
			 return stackImpl.isEmpty();
		}
		
			public boolean isFull() {
				 return stackImpl.isFull();
			}
			
				public int top() {
					 return stackImpl.top();
				}
				
					public int pop() {
						return stackImpl.pop();
					}

					public void setTotal(int total) {
						this.total = total;
					}
				
}
//222 aaaaa