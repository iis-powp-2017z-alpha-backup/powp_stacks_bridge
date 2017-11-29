package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;
import edu.kis.vh.stacks.factory.StackFactory;

class StacksDemo {

	private static final int COUNT = 15;

	public static void main(String[] args) {
		
		DefaultStacksFactory factory = new DefaultStacksFactory();
		StackFactory array = new ArrayStacksFactory();
		StackFactory list = new ListStacksFactory();

		testStacks(factory);
		testCollectStacks(array);
		testCollectStacks(list);

	}

	private static void testStacks(DefaultStacksFactory factory) {
		
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < COUNT; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < COUNT; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

	private static void testCollectStacks(StackFactory factory) {
		
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack()};

		for (int i = 1; i < COUNT; i++)
			for (int j = 0; j < stacks.length; j++)
				stacks[j].push(i);
		
		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
	}
	
}