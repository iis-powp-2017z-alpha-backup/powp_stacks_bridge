package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStackFactory;
import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.factory.ListStackFactory;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		StackDemoWorker stackDemoWorker = new StackDemoWorker();
		IstacksFactory defaultStacksFactory= new DefaultStacksFactory();
		IstacksFactory arrayStackFactory = new ArrayStackFactory();
		IstacksFactory listStackFactory = new ListStackFactory();

		System.out.println("DefaultStackFactory \n");
		stackDemoWorker.work(defaultStacksFactory);
		System.out.println("End \n");

		System.out.println("ArrayStackFactory \n");
		stackDemoWorker.work(arrayStackFactory);
		System.out.println("End \n");

		System.out.println("ListStackFactory \n");
		stackDemoWorker.work(listStackFactory);
		System.out.println("End \n");


		
	}
	
}