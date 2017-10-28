package edu.kis.vh.stacks;

public interface StackInterface {
	
	final int emptyStack = 0; // Posiadając stałą we wspólnym interfejsie mogę zmienić jej wartość jednokrotnie a zadziała we wszystkich klasach
							  // implementujących ten interfejs. Oszczędność czasu i przejrzystość kou była by jeszcze bardziej widoczna przy większej ilości implementujących ten interfejs klas.
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}