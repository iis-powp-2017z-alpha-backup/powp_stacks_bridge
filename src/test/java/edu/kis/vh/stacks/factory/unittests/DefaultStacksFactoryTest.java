package edu.kis.vh.stacks.factory.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class DefaultStacksFactoryTest {

	@Test
	public void testGetStandardStack() {
		DefaultStacksFactory defaultStacksFactoryObj = new DefaultStacksFactory();
		assertNotNull(defaultStacksFactoryObj.getStandardStack());
	}

	@Test
	public void testGetFalseStack() {
		DefaultStacksFactory defaultStacksFactoryObj = new DefaultStacksFactory();
		assertNotNull(defaultStacksFactoryObj.getFalseStack());
	}

	@Test
	public void testGetFIFOStack() {
		DefaultStacksFactory defaultStacksFactoryObj = new DefaultStacksFactory();
		assertNotNull(defaultStacksFactoryObj.getFIFOStack());
	}

	@Test
	public void testGetHanoiStack() {
		DefaultStacksFactory defaultStacksFactoryObj = new DefaultStacksFactory();
		assertNotNull(defaultStacksFactoryObj.getHanoiStack());
	}

}
