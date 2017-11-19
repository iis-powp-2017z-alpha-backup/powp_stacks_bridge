package edu.kis.vh.stacks.demo;

import java.util.Stack;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackInterface;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.factory.StackFactoryArray;
import edu.kis.vh.stacks.factory.StackFactoryList;

class StacksDemo {

	public static void main(String[] args) {
		IstacksFactory factory = new DefaultStacksFactory();
		testStacks(factory);
		factory = new StackFactoryArray();
		testStacks(factory);
		factory = new StackFactoryList();
		testStacks(factory);
	}

	private static void testStacks(IstacksFactory factory) {
		stack[] stacks = { factory.GetStandardStack(), factory.GetFalseStack(),
				factory.GetFIFOStack(), factory.GetHanoiStack()};
		
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
		
		System.out.println("total rejected is "
				+ ((StackHanoi) stacks[3]).reportRejected());
	}
	
}

//17. Zasadę łamię StackHanoi i StackFIFO, należałoby zaimplementować w tych klasach wspólny ze StackArray i StackList interface.