package edu.kis.vh.stacks.unittests;


import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;
import junit.framework.Assert;

public class StacksFactoryTest {

	@Test
	public void defaultStacksFactoryTest() {
		DefaultStacksFactory testFactory = new DefaultStacksFactory();
		Assert.assertEquals(Stack.class , testFactory.createFalseStack().getClass());
		Assert.assertEquals(Stack.class , testFactory.createStandardStack().getClass());
		Assert.assertEquals(StackFIFO.class , testFactory.createFIFOStack().getClass());
		Assert.assertEquals(StackHanoi.class , testFactory.createHanoiStack().getClass());
	}
	
	@Test
	public void arrayStacksFactoryTest() {
		ArrayStacksFactory testFactory = new ArrayStacksFactory();
		Assert.assertEquals(Stack.class , testFactory.createFalseStack().getClass());
		Assert.assertEquals(Stack.class , testFactory.createStandardStack().getClass());
		Assert.assertEquals(StackFIFO.class , testFactory.createFIFOStack().getClass());
		Assert.assertEquals(StackHanoi.class , testFactory.createHanoiStack().getClass());
	}
	
	@Test
	public void listStacksFactoryTest() {
		ListStacksFactory testFactory = new ListStacksFactory();
		Assert.assertEquals(Stack.class , testFactory.createFalseStack().getClass());
		Assert.assertEquals(Stack.class , testFactory.createStandardStack().getClass());
		Assert.assertEquals(StackFIFO.class , testFactory.createFIFOStack().getClass());
		Assert.assertEquals(StackHanoi.class , testFactory.createHanoiStack().getClass());
	}

}
