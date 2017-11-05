package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impl.StackList;

public class Stack {

	// Bridge:
	// 1. Niestety nie jestem w stanie rozpoznac jak dziala funkcja klawisza F3, poniewaz nic sie nie dzieje
	// 2. CTRL + t: wyswietla nam hierarchie przeciazania konkretnych metod danej klasy
	// 3. CTRL + kursor: pozwala nam wybrac czy chcemy zobaczyc deklaracje lub implementacje danej metody
	// i daje rowniez mozliwosc wybrania implementacji w klasie bazowej oraz w razie potrzeby wyswietla nam liste hierarchi
	// w celu wybrania, w ktorej klasie chcemy zobaczyc dana metode. Przenosi nas w to miejsce.
	
	private IStack stack;

	public Stack() {
		this.stack = new StackList();
	}

	public Stack(IStack stack) {
		super();
		this.stack = stack;
	}
	
	public int getTotal() {
		return stack.getTotal();
	}

	public void push(int i) {
		stack.push(i);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int top() {
		return stack.top();
	}

	public int pop() {
		return stack.pop();
	}

}
