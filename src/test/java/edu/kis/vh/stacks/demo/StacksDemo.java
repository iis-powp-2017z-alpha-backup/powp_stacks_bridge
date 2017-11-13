package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		testStacks(factory);

	}

	private static void testStacks(DefaultStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());

	}

}

// W pliku StacksDemo zmianie ulegly linie 26 - 29
// Usunieto bledy formatowania
// Skrot klawiszowy "alt + <-" pozwala na przechodzenie pomiedzy kartami
// polecenie 8 - brak pol do enkapsulacji