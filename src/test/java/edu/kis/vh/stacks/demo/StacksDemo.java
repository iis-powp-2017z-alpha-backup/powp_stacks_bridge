package edu.kis.vh.stacks.demo;
//test dom 1.11.2017
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class StacksDemo {

	private static final int MAXIMUM = 15;
	private static final int SIZE = 3;
	private static final int RANDOM_TOP = 20;

	public static void main(String[] args) {
		DefaultStacksFactory defaultStacksFactory = new DefaultStacksFactory();
		Stack[] stacks = { defaultStacksFactory.getStandardStack(), defaultStacksFactory.getFalseStack(),
				defaultStacksFactory.getFIFOStack(), defaultStacksFactory.getHanoiStack() };

		testStacks(stacks);
	}

	public static void testStacks(Stack[] stacks) {
		for (int i = 1; i < MAXIMUM; i++)
			for (int j = 0; j < SIZE; j++)
				stacks[j].push(i);

		java.util.Random random = new java.util.Random();
		for (int i = 1; i < MAXIMUM; i++)
			stacks[SIZE].push(random.nextInt(RANDOM_TOP));
		
		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
		System.out.println("total rejected is " + ((StackHanoi) stacks[SIZE]).reportRejected());
	}

}
// 3.1.1 zle byly sformatowane wiersze 26,27,28,29
// 3.1.3 Alt ze strzalka w lewo zmienia karte na inna, w moim przypadku na
// pierwsza otwarta czyli StackFIFO, strzalka w prawo zmienia w prawo karte