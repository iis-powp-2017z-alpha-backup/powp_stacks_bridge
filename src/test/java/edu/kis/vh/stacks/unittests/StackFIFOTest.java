package edu.kis.vh.stacks.unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;

public class StackFIFOTest {

	private StackFIFO stackFIFO;

	@Before
	public void setUp() throws Exception {
		stackFIFO = new StackFIFO();
	}

	@Test
	public void popShouldReturnOne() {
		stackFIFO.push(1);
		assertEquals(1, stackFIFO.pop());
	}
}
