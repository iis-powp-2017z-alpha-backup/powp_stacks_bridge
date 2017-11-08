package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.*;


//Zle sformatowane wiersze:
// StackDemo.java : 12, 20, 24, 26, 29
// Stack.java : 11 - 35
// StackFIFO.java : 11, 15
// StackHanoi : 12 - 15

class StacksDemo {

	private static final String TOTAL_REJECTED_IS = "total rejected is ";

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		ArrayStacksFactory factory2 = new ArrayStacksFactory(15);
		ListStacksFactory factory3 = new ListStacksFactory(15);
		
		testStacks(factory);
		testStacks(factory2);
		testStacks(factory3);
	}

	private static void testStacks(IstacksFactory factory) {
		
		System.out.println("\n Running with " + factory.getClass() + " class");
		
		Stack[] stacks = { factory.createStandardStack(), factory.createFalseStack(), factory.createFIFOStack(),
				factory.createHanoiStack() };

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

		System.out.println(TOTAL_REJECTED_IS + ((StackHanoi) stacks[3]).reportRejected());
	}
}