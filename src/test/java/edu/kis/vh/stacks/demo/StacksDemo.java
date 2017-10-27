package edu.kis.vh.stacks.demo;


import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		StacksDemoHelper stacksHelper = new StacksDemoHelper();
		DefaultStacksFactory defaultFactory = new DefaultStacksFactory();
		ArrayStacksFactory arrayFactory = new ArrayStacksFactory();
		ListStacksFactory listFactory = new ListStacksFactory();

		System.out.println("=================DefaultStacksFactory BEGIN=================");
		stacksHelper.factoryDemo(defaultFactory);
		System.out.println("=================DefaultStacksFactory END=================\n");

		System.out.println("=================ArrayStacsFactory BEGIN=================");
		stacksHelper.factoryDemo(arrayFactory);
		System.out.println("=================ArrayStacsFactory END=================\n");

		System.out.println("=================ListStacksFactory BEGIN=================");
		stacksHelper.factoryDemo(listFactory);
		System.out.println("=================ListStacksFactory END=================");
	}

}