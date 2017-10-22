package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;


class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		final int NUMBER_OF_VALUES = 15;
		final int NUMBER_OF_LEVELS = 3;
		final int NUMBER = 20; 
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < NUMBER_OF_VALUES; i++)
			for (int j = 0; j < NUMBER_OF_LEVELS; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < NUMBER_OF_VALUES; i++)
			stacks[NUMBER_OF_LEVELS].push(rn.nextInt(NUMBER));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[NUMBER_OF_LEVELS]).reportRejected());

	}

}

// StackDecom: linie 11-14, 19, 20, 21, 23, 24, 25, 26, 27, 29
// stackTest: linia 15
// StackHanoi: linie 5, 8, 12, 13
// StackFIFO: linie 11, 17
// stack: linie 11-37
// IstacksFactory: linie 7-17

//alt + -> lub alt + <- cofa sie do poprzednich otworzonych okienek, lub gdy cofniemy sie wracamy spowrotem.