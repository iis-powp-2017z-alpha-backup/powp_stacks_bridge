package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	private static final int END_POINT = 15;
	private static final int START_POINT = 1;
	private static final int RANGE = 20;

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = START_POINT; i < END_POINT; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = START_POINT; i < END_POINT; i++)
			stacks[3].push(rn.nextInt(RANGE));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		} // 8 wierszy zle formatowanie

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

	}

}