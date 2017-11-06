package edu.kis.vh.stacks.stackRealization;

public class StackArray implements StackImplementationIfU {
	private static final int INITIAL_MAX_STACK_SIZE = 12;

	private static final int STACK_INTERATOR_EMPTY_STACK = -1;

	private int[] ITEMS = new int[INITIAL_MAX_STACK_SIZE];	

	private int total = STACK_INTERATOR_EMPTY_STACK;
	
	private int nrOfElements;
	
	public StackArray(){}
	
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
			ITEMS[++total] = i;
	}
	
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == STACK_INTERATOR_EMPTY_STACK;
	}
		
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == nrOfElements - 1;
	}
			
	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return STACK_INTERATOR_EMPTY_STACK;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackImplementationIfU#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return STACK_INTERATOR_EMPTY_STACK;
		return ITEMS[total--];
	}

	public int getNrOfElements() {
		return nrOfElements;
	}

	public void setNrOfElements(int nrOfElements) {
		this.nrOfElements = nrOfElements;
	}

}
