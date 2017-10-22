package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), // wczesne zalamanie tekstu
				factory.getFIFOStack(), factory.getHanoiStack() };// brakujaca spacja

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();// zle wciecie
		for (int i = 1; i < 15; i++)// zle wciecie
			stacks[3].push(rn.nextInt(20));// zle wciecie

		for (int i = 0; i < stacks.length; i++) {// zle wciecie
			while (!stacks[i].isEmpty())// zle wciecie
				System.out.print(stacks[i].pop() + "  ");// zle wciecie
			System.out.println();// zle wciecie
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());// przedwczesne zalamanie
																								// lini

	}

}