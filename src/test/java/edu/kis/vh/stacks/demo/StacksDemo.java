package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {
	private static final int RAND_MAX = 20;
	private static final int STACKS_QUANTITY = 3;

	// zmiany zaszły w liniach: 11-14, 18-30, 32
	// kombinacja alt + -> lub <- + alt przenosi nas do miejsca ostatnio wprowadzonej zmiany w przód lub w tył
	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		Stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(), factory.GetFIFOStack(),
				factory.GetHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < STACKS_QUANTITY; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(RAND_MAX));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

	}

}