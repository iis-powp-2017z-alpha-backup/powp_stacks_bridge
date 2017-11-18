package edu.kis.vh.stacks;

import edu.kis.vh.stacks.StacksInterface;
import edu.kis.vh.stacks.stacksinterfaces.StackList;

public class Stack {
	/* Because stackInter is of StacksInterface type (also of Interface type) it means that i can give to methods classes objects
	that implements Interface "StacksInterface". In my code those are object of StacksArray and StacksList classes*/
	private StacksInterface stackInter;
	
	public Stack() {
		this(new StackList());
	}
	
	public Stack(StacksInterface stackInter) {
		super();
		this.stackInter = stackInter;
	}

	public int getTotal() {
		return stackInter.getTotal();
	}

	public void push(int i) {
		stackInter.push(i);
	}

	public boolean isEmpty() {
		return stackInter.isEmpty();
	}

	public boolean isFull() {
		return stackInter.isFull();
	}

	public int top() {
		return stackInter.top();
	}

	public int pop() {
		return stackInter.pop();
	}

}

/*
 Navigate -> Open Declaration: it moves me to StacksInterface methode. 
 Navigate -> Quick Type Hierarchy: It open window where I can choose one of classes that implements the selected methode. 
 			 It moves me directly to methode in chosen class. So in a way it goes one step farther than Navigate -> Open Declaration.
 ctrl + mouse working: On my computer it doesn't change anything. But it can be caused by my keyboard because it has only one ctrl key and it sometimes
 			 doesn't work at it should in some programs.
 */	    
