package edu.kis.vh.stacks;

public class stack {

	private int[] ITEMS = new int[12];	

	private int total = -1;
	
	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}
	
		public boolean isEmpty() {
			return total == -1;
		}
		
			public boolean isFull() {
				return total == 11;
			}
			
				public int top() {
					if (isEmpty())
						return -1;
					return ITEMS[total];
				}
				
					public int pop() {
						if (isEmpty())
							return -1;
						return ITEMS[total--];
					}

					public void setTotal(int total) {
						this.total = total;
					}
				
}
//222 aaaaa