package edu.kis.vh.stacks.factory.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class StackArrayFactoryTest {

	@Test
	public void testGetStandardStack() {
		DefaultStacksFactory stackArrayFactoryObj = new DefaultStacksFactory();
		assertNotNull(stackArrayFactoryObj.getStandardStack());
	}

	@Test
	public void testGetFalseStack() {
		DefaultStacksFactory stackArrayFactoryObj = new DefaultStacksFactory();
		assertNotNull(stackArrayFactoryObj.getFalseStack());
	}

	@Test
	public void testGetFIFOStack() {
		DefaultStacksFactory stackArrayFactoryObj = new DefaultStacksFactory();
		assertNotNull(stackArrayFactoryObj.getFIFOStack());
	}

	@Test
	public void testGetHanoiStack() {
		DefaultStacksFactory stackArrayFactoryObj = new DefaultStacksFactory();
		assertNotNull(stackArrayFactoryObj.getHanoiStack());
	}

}
