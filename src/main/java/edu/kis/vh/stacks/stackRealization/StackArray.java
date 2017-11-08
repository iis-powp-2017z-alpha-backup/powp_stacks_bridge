package edu.kis.vh.stacks.stackRealization;

public class StackArray implements StackImplementationIfU {
	
	private static final int INITIAL_MAX_STACK_SIZE = 12;
	private int[] ITEMS;	
	private int total;
	private int nrOfElements;
	
	public StackArray(){
		nrOfElements = INITIAL_MAX_STACK_SIZE;
		ITEMS = new int[INITIAL_MAX_STACK_SIZE];
		total = EMPTY_STACK;
	}
	
	public StackArray(int nrOfElements){
		this.setNrOfElements(nrOfElements);
		ITEMS = new int [nrOfElements];
	}
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[total++] = i;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK;
	}
		
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == nrOfElements;
	}
			
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return ITEMS[total-1];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		return ITEMS[--total];
	}

	public int getNrOfElements() {
		return nrOfElements;
	}

	public void setNrOfElements(int nrOfElements) {
		this.nrOfElements = nrOfElements;
	}

}
