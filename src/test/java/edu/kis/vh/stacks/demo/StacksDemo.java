package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	private static final int MAX_J = 3;
	private static final int MIN_J = 0;
	private static final int MIN = 1;
	private static final int MAX = 15;

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		Stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(), factory.GetFIFOStack(),
				factory.GetHanoiStack() };

		for (int i = MIN; i < MAX; i++)
			for (int j = MIN_J; j < MAX_J; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = MIN; i < MAX; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = MIN - 1; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

	}

}

// 3.1.1 Źle sformatowane linie to: 26,27,28,29
// 3.1.3 Alt + <- oraz alt + -> powodują przejścia między ostatnio aktywnymi
// plikami