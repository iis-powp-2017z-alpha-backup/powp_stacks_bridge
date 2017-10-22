package edu.kis.vh.stacks;

public class Stack {

	private static final int TOTAL_NUMBER = 11;

	private static final int STACK_MINUS = -1;

	private static final int TABLE_SIZE = 12;

	private int[] ITEMS = new int[TABLE_SIZE];	

	public int total = STACK_MINUS;
	
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
		public boolean isEmpty() {
			return total == STACK_MINUS;
		}
		
			public boolean isFull() {
				return total == TOTAL_NUMBER;
			}
			
				public int top() {
					if (isEmpty())
						return STACK_MINUS;
					return ITEMS[total];
				}
				
					public int pop() {
						if (isEmpty())
							return STACK_MINUS;
						return ITEMS[total--];
					}
				
}
// zmiany wprowadzamy i zobaczymy jak to bedzie