package edu.kis.vh.stacks.unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class DefaultStacksFactoryTest {

	DefaultStacksFactory defaultStacksFactory;
	@Before
	public void setUp() throws Exception {
		defaultStacksFactory = new DefaultStacksFactory();
	}

	@Test
	public void getStandardStackShouldReturnNotNullStack() {
		assertNotNull(defaultStacksFactory.getStandardStack());
	}
	
	@Test
	public void getFalseStackShouldReturnNotNullStack() {
		assertNotNull(defaultStacksFactory.getFalseStack());
	}
	
	@Test
	public void getFIFOStackShouldReturnNotNullStack() {
		assertNotNull(defaultStacksFactory.getFIFOStack());
		assertTrue(defaultStacksFactory.getFIFOStack() instanceof StackFIFO);
	}
	
	@Test
	public void getHanoiStackShouldReturnNotNullStack() {
		assertNotNull(defaultStacksFactory.getHanoiStack());
		assertTrue(defaultStacksFactory.getHanoiStack() instanceof StackHanoi);
	}

}
