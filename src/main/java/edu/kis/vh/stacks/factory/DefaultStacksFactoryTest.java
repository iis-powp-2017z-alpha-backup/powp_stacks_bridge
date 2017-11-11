package edu.kis.vh.stacks.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefaultStacksFactoryTest {
	DefaultStacksFactory factory = new DefaultStacksFactory();

	@Test
	public void testGetStandardStack() {
		assertNotNull(factory.getStandardStack());
	}

	@Test
	public void testGetFalseStack() {
		assertNotNull(factory.getFalseStack());
	}

	@Test
	public void testGetFifoStack() {
		assertNotNull(factory.getFifoStack());
	}

	@Test
	public void testGetHanoiStack() {
		assertNotNull(factory.getHanoiStack());
	}

}
