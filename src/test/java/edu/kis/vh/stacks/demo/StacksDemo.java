package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.StackArrayFactory;
import edu.kis.vh.stacks.factory.StackListFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;

//w linia 31 i 33 zbędne entery
//linia java.util.Random rn = new java.util.Random(); oraz 2 kolejne fory przesunięte jeden tab w lewo
//Ostatnia instrujca drukująca elementy na ekranie połączona w 1 linii
//System.out.println(); przesunięty w lewo o jeden tab
//alt + ← oraz alt + → przelacza widoki pomiędzy plikami, w takiej kolejności w jakiej byly one edytowane
class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		StackArrayFactory sAFactory = new StackArrayFactory();
		StackListFactory sLFactory = new StackListFactory();

		testStacks(factory);
		testStacks(sAFactory);
		testStacks(sLFactory);
	}

	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

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

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}
}