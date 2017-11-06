package edu.kis.vh.stacks;

/**
 * @author Krzysztof Kita
 *
 */
public class StackHanoi extends Stack {

	/**
	 * Atrybut przechowujący ilość odrzuconych, niepoprawynch elementów stosu
	 */
	private int totalRejected = 0;

	/**
	 * Konstruktor bezparametrowy
	 */
	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param stack
	 *            Ten konstruktor służy do wybrania stosu opartego na liście albo na
	 *            tablicy
	 */
	public StackHanoi(StackInterface stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return Metoda zwraca liczbę odrzuconych elementów
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/*
	 * Ta metoda służy do wrzucania nowych elementów na stos, gdy nowy element
	 * będzie większy od poprzedniego i stos nie będzie pusty w tedy zwiększony
	 * zostanie atrybut totalRejected. (non-Javadoc)
	 * 
	 * @see edu.kis.vh.stacks.Stack#push(int)
	 */
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top()) {
			totalRejected++;
		} else {
			super.push(in);
		}
	}

}
