package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	private static final int MAXIMUM_J = 3;
	private static final int MINIMUM_J = 0;
	private static final int MINIMUM = 1;
	private static final int MAXIMUM = 15;

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		Stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(), factory.GetFIFOStack(),
				factory.GetHanoiStack() };

		for (int i = MINIMUM; i < MAXIMUM; i++)
			for (int j = MINIMUM_J; j < MAXIMUM_J; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = MINIMUM; i < MAXIMUM; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

	}

}
// 3.1.1 zle byly sformatowane wiersze 26,27,28,29
// 3.1.3 Alt ze strzalka w lewo zmienia karte na inna, w moim przypadku na
// pierwsza otwarta czyli StackFIFO, strzalka w prawo zmienia w prawo karte