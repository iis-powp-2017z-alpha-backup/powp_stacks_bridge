package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.StackArrayFactory;
import edu.kis.vh.stacks.factory.StackListFactory;

/**
 * @author damian.stepnik
 * klasa demonstrujaca dzialanie programu
 */
class StacksDemo {

	private static final String MESSAGE_TOTAL_REJECTED = "total rejected is ";

	/**
	 * @param args
	 * zainicjowanie obiektow roznych fabryk i przekazanie ich do metody testStacks
	 */
	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();	
		StackListFactory stackListFactory = new StackListFactory();
		StackArrayFactory stackArrayFactory = new StackArrayFactory();

		testStacks(factory);	
		testStacks(stackListFactory);
		testStacks(stackArrayFactory);
		
	}
	
	/**
	 * @param stackListFactory
	 * wylistowanie (pintln) stosow
	 */
	private static void testStacks(IStacksFactory stackListFactory) {
		Stack[] stacks = { stackListFactory.getStandardStack(), stackListFactory.getFalseStack(), stackListFactory.getFIFOStack(),
				stackListFactory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println(MESSAGE_TOTAL_REJECTED + ((StackHanoi) stacks[3]).reportRejected());
	}

}

// linie 12-13: dodano spacje przy klamerce zamykajacej
// linie 19-27: za duzo wciec
// linia 26: wcięta byla o 2 taby za duzo
// linie 29-30: polaczono w jeden wiersz
// alt + strzalki: poruszanie sie do tylu lub przodu w sensie poprzednio/nastepny ogladany plik