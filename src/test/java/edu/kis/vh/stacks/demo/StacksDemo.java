package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	private static final int NEXT_NUMBER = 3;
	private static final int BETWEEN_NUMBER = 3;
	private static final int MAX_NUMBER = 15;
	private static final int MIN_NUMBER = 1;

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		Stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(), factory.GetFIFOStack(),
				factory.GetHanoiStack() };

		for (int i = MIN_NUMBER; i < MAX_NUMBER; i++)
			for (int j = 0; j < BETWEEN_NUMBER; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = MIN_NUMBER; i < MAX_NUMBER; i++)
			stacks[NEXT_NUMBER].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[NEXT_NUMBER]).reportRejected());

	}

}
// 3.1.1 żle sformatowane były liniki od 26 do 29
// 3.1.2 wykonany
// 3.1.3 po zastosowaniu komend z instrukcji w pliku StackFIFO pojawiły się
// znaki specjalne. Przy drugiej komendzie wrociło do pliku StacksDemo i też
// pojawił się znak specjalny