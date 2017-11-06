package edu.kis.vh.stacks.unittests;


import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import junit.framework.Assert;

public class DefaultStacksFactoryTest {

	@Test
	public void stacksCreatingTest() {
		DefaultStacksFactory testFactory = new DefaultStacksFactory();
		Assert.assertEquals(Stack.class , testFactory.createFalseStack().getClass());
		Assert.assertEquals(Stack.class , testFactory.createStandardStack().getClass());
		Assert.assertEquals(StackFIFO.class , testFactory.createFIFOStack().getClass());
		Assert.assertEquals(StackHanoi.class , testFactory.createHanoiStack().getClass());
	}

}
