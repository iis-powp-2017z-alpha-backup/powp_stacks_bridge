package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

class StacksDemo {

	static void testStacks(IstacksFactory factory) {
		Stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(), factory.GetFIFOStack(),
				factory.GetHanoiStack() };

		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 3; j++) {
				stacks[j].push(i);
			}
		}

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++) {
			stacks[3].push(rn.nextInt(20));
		}

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty()) {
				System.out.print(stacks[i].pop() + "  ");
			}
			System.out.println();
		}
		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

	}

	public static void main(String[] args) {
		DefaultStacksFactory defaultFactory = new DefaultStacksFactory();
		ArrayStacksFactory arrayFactory = new ArrayStacksFactory();
		ListStacksFactory listFactory = new ListStacksFactory();

		System.out.println("=================DefaultStacksFactory BEGIN=================");
		testStacks(defaultFactory);
		System.out.println("=================DefaultStacksFactory END=================\n");

		System.out.println("=================ArrayStacsFactory BEGIN=================");
		testStacks(arrayFactory);
		System.out.println("=================ArrayStacsFactory END=================\n");

		System.out.println("=================ListStacksFactory BEGIN=================");
		testStacks(listFactory);
		System.out.println("=================ListStacksFactory END=================");
	}

}