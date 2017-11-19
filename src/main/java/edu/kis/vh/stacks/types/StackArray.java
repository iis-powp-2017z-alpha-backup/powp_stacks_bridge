package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.IStack;

public class StackArray implements IStack {
	
	private static final int EMPTY = -1;

	private static final int NUMBER_OF_ITEMS = 12;

	private int[] ITEMS = new int[NUMBER_OF_ITEMS];	

	private int total = EMPTY;
	
	@Override
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
		@Override
		public boolean isEmpty() {
			return total == EMPTY;
		}
		
			@Override
			public boolean isFull() {
				return total == NUMBER_OF_ITEMS-1;
			}
			
				@Override
				public int top() {
					if (isEmpty())
						return EMPTY;
					return ITEMS[total];
				}
				
					@Override
					public int pop() {
						if (isEmpty())
							return EMPTY;
						return ITEMS[total--];
					}

					public int getTotal() {
						return total;
					}
}
