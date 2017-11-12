package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	private static final int NEXT_NUMBER = 3;
	private static final int BETWEEN_NUMBER = 3;
	private static final int MAX_NUMBER = 15;
	private static final int MIN_NUMBER = 1;

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		testStacks(factory);

	}

	private static void testStacks(DefaultStacksFactory factory) {
		//TODO: there is enough place for "factory.getHanoiStack()" in the upper line. So it shoudn't be moved to the lower line 
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFifoStack(),
				factory.getHanoiStack() };

		for (int i = MIN_NUMBER; i < MAX_NUMBER; i++)
			for (int j = 0; j < BETWEEN_NUMBER; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = MIN_NUMBER; i < MAX_NUMBER; i++)
			stacks[NEXT_NUMBER].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[NEXT_NUMBER]).reportRejected());
	}

}
