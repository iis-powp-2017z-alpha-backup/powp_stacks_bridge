package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	// Bridge:
	// Zmienna temp wykorzystuje implementacje StackList, poniewaz konstruktor klasy Stack domyślnie wykorzystuje ta implementacje.
	// Jest ona lepsza od StackArray, poniewaz nie jest ograniczona rozmiarem stosu i jest dynamiczna.
	private final Stack temp = new Stack();

	public StackFIFO() {
		super();
	}

	public StackFIFO(IStack stack) {
		super(stack);
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
