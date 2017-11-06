package edu.kis.vh.stacks.factory.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class StackListFactoryTest {

	@Test
	public void testGetStandardStack() {
		DefaultStacksFactory stackListFactoryObj = new DefaultStacksFactory();
		assertNotNull(stackListFactoryObj.getStandardStack());
	}

	@Test
	public void testGetFalseStack() {
		DefaultStacksFactory stackListFactoryObj = new DefaultStacksFactory();
		assertNotNull(stackListFactoryObj.getFalseStack());
	}

	@Test
	public void testGetFIFOStack() {
		DefaultStacksFactory stackListFactoryObj = new DefaultStacksFactory();
		assertNotNull(stackListFactoryObj.getFIFOStack());
	}

	@Test
	public void testGetHanoiStack() {
		DefaultStacksFactory stackListFactoryObj = new DefaultStacksFactory();
		assertNotNull(stackListFactoryObj.getHanoiStack());
	}

}
