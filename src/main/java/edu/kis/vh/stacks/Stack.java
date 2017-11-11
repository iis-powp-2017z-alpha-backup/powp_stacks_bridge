package edu.kis.vh.stacks;

public class Stack {

	private static final int EMPTY = -1;

	private static final int NUMBER_OF_ITEMS = 12;

	private int[] ITEMS = new int[NUMBER_OF_ITEMS];	

	public int total = EMPTY;
	
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
		public boolean isEmpty() {
			return total == EMPTY;
		}
		
			public boolean isFull() {
				return total == NUMBER_OF_ITEMS-1;
			}
			
				public int top() {
					if (isEmpty())
						return EMPTY;
					return ITEMS[total];
				}
				
					public int pop() {
						if (isEmpty())
							return EMPTY;
						return ITEMS[total--];
					}
				
}
