package edu.kis.vh.stacks.unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.kis.vh.stacks.implementations.StackList;

public class StackListTest {

	StackList stackList;

	@Before
	public void setUp() throws Exception {
		stackList = new StackList();
	}

	@Test
	public void pushElementShouldPush() {
		stackList.push(2);

		assertEquals(2, stackList.pop());
	}
}
