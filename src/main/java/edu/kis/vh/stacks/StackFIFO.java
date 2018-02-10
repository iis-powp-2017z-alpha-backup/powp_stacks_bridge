package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementations.StackList;
/* zad 14
 	Wybralem StackList, poniewaz pozwala na uzycie stosu bez ograniczenia wielkosci,
 	a ilosc pamieci jaka zajmuje jest zalezna od wielkosci samego stosu a nie narzucona
 	oddgornie
 */

public class StackFIFO extends stack {

	public StackList temp;
	
		public StackFIFO() {
			super();
			temp = new StackList();
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
