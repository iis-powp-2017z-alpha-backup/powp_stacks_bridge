package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackI;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.StackArrayFactory;
import edu.kis.vh.stacks.factory.StackListFactory;
import edu.kis.vh.stacks.factory.StacksFactory;

class StacksDemo {

	private static final int FULL = 15;

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		StacksFactory array = new StackArrayFactory();
		StacksFactory list = new StackListFactory();

		testStacks(factory);

		testCollectStacks(array);
		testCollectStacks(list);

	}

	private static void testStacks(DefaultStacksFactory factory) {// c3
		StackI[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < FULL; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < FULL; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

	private static void testCollectStacks(StacksFactory factory) {

		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack() };

		for (int i = 1; i < FULL; i++)
			for (int j = 0; j < stacks.length; j++)
				stacks[j].push(i);

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
	}

}